package para2;

import java.io.IOException;

public class MultiThreadDown {
    public static void main(String[] args) throws Exception {
        final DownUtil downUtil =new DownUtil("http://www.crazyit.org/"
                + "data/attachment/forum/month_1403/1403202355ff6cc9a4fbf6f14a.png",
                "ios.png", 4);
        downUtil.download();
        new Thread(()->{
            while (downUtil.getCompleteRate() < 1){
                System.out.println("Finish: " + downUtil.getCompleteRate());
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        }).start();
    }
}
