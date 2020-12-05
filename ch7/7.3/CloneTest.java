class Address{
    String detail;
    public Address(String detail){
        this.detail = detail;
    }
    @Override
    public String toString() {
        return detail;
    }
}

class User implements Cloneable{
    int age;
    Address address;

    public User(int age){
        this.age = age;
        address = new Address("GuangZhou TianHe 广州");
    }

    public User clone() throws CloneNotSupportedException{
        return (User)super.clone();
    }
}


/**
 * CloneTest
 */
public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException{
        User u1 = new User(29);
        User u2 = u1.clone();
        System.out.println(u1==u2);
        System.out.println(u1.address == u2.address); // same address
        System.out.println(u1.address);
    }

}