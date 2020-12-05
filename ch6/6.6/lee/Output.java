package lee;
public interface Output{
    // define fields(only constant variable)
    int MAX_CACHE_LINE = 49;
    // equal to 
    public static final int MAX_LEN = 199;

    void out();
    public abstract void getData(String msg);

    // define the default method
    default void print(String... msgs){
        for(String msg:msgs){
            System.out.println(msg);
        }
    }

    // dfine the default method, need default 
    default void test(){
        System.out.println("Default test() method!");
    }

    static String staticTest(){
        return "static method in the interface";
    }
}