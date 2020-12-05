/**
 * Student
 */
package school;
public class Student {

    private String name;
    private int age;
    private String gender;
    private String phone;
    private String address;
    private String email;

    public Student(){

    }
    public Student(String name, int age, String gender, String phone, String address, String email){
        setAddress(address);
        setAge(age);
        setGender(gender);
        setName(name);
        setPhone(phone);
        setEmail(email);
    }

    public void eat(){
        System.out.println("Eat Something!");
    }
    public void eat(String eatableThing){
        System.out.println("Eat" + eatableThing + " !");
    }

    public void sleep(){
        System.out.println("Sleep!");
    }
    public void play(){
        System.out.println("Play and have fun!");
    }








    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }
    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

}