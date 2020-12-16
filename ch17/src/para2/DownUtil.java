package para2;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownUtil {
    private String path;
    private String targetFile;
    private int threadNum;
    private DownThread[] threads;
    private int fileSize;

    public DownUtil(String path, String targetFile, int threadNum){
        this.path = path;
        this.targetFile = targetFile;
        this.threadNum = threadNum;
        threads = new DownThread[threadNum];

    }

    public void download() throws  Exception{
        URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setConnectTimeout(5 * 1000);
        conn.setRequestMethod("GET");
        conn.setRequestProperty(
                "Accept",
                "image/gif, image/jpeg, image/pjpeg, image/pjpeg, "
                        + "application/x-shockwave-flash, application/xaml+xml, "
                        + "application/vnd.ms-xpsdocument, application/x-ms-xbap, "
                        + "application/x-ms-application, application/vnd.ms-excel, "
                        + "application/vnd.ms-powerpoint, application/msword, */*");

        conn.setRequestProperty("Accept-Language", "zh-CN");
        conn.setRequestProperty("Charset", "UTF-8");
        conn.setRequestProperty("Connection", "Keep-Alive");

        // get file size
        fileSize = conn.getContentLength();
        conn.disconnect();
        int currentPartSize = fileSize / threadNum + 1; // add 1 for cannot complete
        RandomAccessFile file = new RandomAccessFile(targetFile, "rw");

        // set local file size
        file.setLength(fileSize);
        file.close();

        for (int i = 0; i < threadNum; i++) {
            int startPos = i * currentPartSize;
            RandomAccessFile currentPart = new RandomAccessFile(targetFile, "rw");
            // locate the position to download
            currentPart.seek(startPos);
            threads[i] = new DownThread(startPos, currentPartSize, currentPart);
            threads[i].start();
        }

    }

    public double getCompleteRate(){
        int sumSize = 0;
        for (int i = 0; i < threadNum; i++) {
            sumSize += threads[i].length;
        }
        return sumSize * 1.0 / fileSize;
    }

    public String getPath() {
        return path;
    }



    private class DownThread extends Thread{
        private int startPos;
        private int currentPartSize;
        private RandomAccessFile currentPart;

        public int length;
        public DownThread(int startPos, int currentPartSize, RandomAccessFile currentPart){
            this.currentPart = currentPart;
            this.currentPartSize = currentPartSize;
            this.startPos = startPos;
        }

        @Override
        public void run() {
            try{
                URL url = new URL(path);
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                conn.setConnectTimeout(5 * 1000);
                conn.setRequestMethod("GET");
                conn.setRequestProperty(
                        "Accept",
                        "image/gif, image/jpeg, image/pjpeg, image/pjpeg, "
                                + "application/x-shockwave-flash, application/xaml+xml, "
                                + "application/vnd.ms-xpsdocument, application/x-ms-xbap, "
                                + "application/x-ms-application, application/vnd.ms-excel, "
                                + "application/vnd.ms-powerpoint, application/msword, */*");

                conn.setRequestProperty("Accept-Language", "zh-CN");
                conn.setRequestProperty("Charset", "UTF-8");
                InputStream inStream = conn.getInputStream();
                inStream.skip(this.startPos);
                byte[] buffer = new byte[2048];
                int hasRead = 0;

                while (length < currentPartSize && (hasRead = inStream.read(buffer)) != -1){
                    currentPart.write(buffer, 0, hasRead);
                    length += hasRead;
                }
                currentPart.close();;
                inStream.close();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }

        }
    }


}




