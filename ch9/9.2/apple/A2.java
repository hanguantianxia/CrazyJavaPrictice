package apple;

public class A2 extends Apple{
    public A2(Object info){
        super(info);
    }
    public String getInfo(){
        return super.getInfo().toString();
    }
}
