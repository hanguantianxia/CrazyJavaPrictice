class Singleton{
    // use a class variable to save the instanced which has initialzed
    private static Singleton instance;
    private Singleton(){}

    // offer a static method to return a Singleton instance
    public static Singleton getInstance(){
        //
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }



}

/**
 * SingletonTest
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}