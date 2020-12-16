public class CharNumPrinter {
    private boolean flag = true;
    private final String[] charTable;
    {
        String[] charTable = new String[26];
        int aNum = (int)'A';
        for (int i = 0; i < 26; i++) {
            charTable[i] = String.valueOf((char)(aNum + i));
        }
        this.charTable = charTable;
    }

    public synchronized void printChar() throws InterruptedException{

        for (int j = 0; j < charTable.length; j++) {
            if(flag){
                wait();
            }

            System.out.print(charTable[j]);
            flag = true;
            notifyAll();

        }
    }

    public synchronized  void printNum() throws InterruptedException{
        for (int i = 1; i <= 52; i++) {
            if(!flag){
                wait();
            }
            System.out.print(i);

            if (i % 2==0){
                flag = false;
                notifyAll();
            }
        }
    }
}


