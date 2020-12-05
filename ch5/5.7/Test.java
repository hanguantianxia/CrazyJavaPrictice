class Root{
    static{
        System.out.println("Root Static inital block!");
    }
    {
        System.out.println("Root normal inital block!");
    }
    public Root(){
        System.out.println("the no params constructor of Root!");
    }
}
class Mid extends Root{
    static{
        System.out.println("the static initial block of Mid!");
    }
    {
        System.out.println("the normal initial block of Mid!");
    }

    public Mid(){
        System.out.println("the no params constructor of Mid!");
    }
    public Mid(String msg){
        this();
        System.out.println("the constructor with params: " + msg);
    }
}

class Leaf extends Mid{
    static{
        System.out.println("the static initial block of Left!");
    }
    {
        System.out.println("the normal initial block of Left!");
    }
    public Leaf(){
        super("Java Crazy Textbook");
        System.out.println("the no params constructor of Left!");
    }
}


public class Test {

    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}


