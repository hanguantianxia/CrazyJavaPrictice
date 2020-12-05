package apple;
public class A1 extends Apple<String>{
    public A1(String info){
        super(info);
    }
    public String getInfo(){
        return "sub class" + super.getInfo();
    }

    // public Object getInfo(){
    //     return "Sub";
    // }
}
