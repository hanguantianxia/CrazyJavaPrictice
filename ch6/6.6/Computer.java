import lee.*;

public class Computer {
    private Output out;
    public  Computer(Output out) {
        this.out = out;
    }
    public void keyIn(String msg){
        out.getData(msg);
    }

    // define a print method
    public void print(){
        out.out();
    }

}
