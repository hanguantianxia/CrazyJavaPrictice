public class Person{
    private String name;
    private int age;

    public void setName(String name){
        // require the length of name in [2,6]
        if(name.length() > 6 || name.length() < 2){
            System.out.println("Input name is not accepted");
            return;
        }
        else{
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        if(age > 100 || age < 0){
            System.out.println("Input age is not accepted!");
            return;
        }
        else{
            this.age = age;
        }
    }
    public int getAge(){
        return this.age;
    }

}