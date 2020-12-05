package school;

import java.util.ArrayList;

public class PhoneBook {
    ArrayList<Student> phonebook;

    public PhoneBook(){}
    public PhoneBook(Student[] students){
        for(Student student : students){
            phonebook.add(student);
        }
    }

    public Student searchByName(String name){
        Student res = null;
        for(Student student : phonebook){
            if(student.getName()==name){
                res = student;
                break;
            }
        }
        if(res == null){
            System.out.println("Cannot find the Student who's name is " + name + " !");
        }

        return res;
    }

    public Student searchByEmail(String email){
        Student res = null;
        for(Student student : phonebook){
            if(student.getEmail()==email){
                res = student;
                break;
            }
        }
        if(res == null){
            System.out.println("Cannot find the Student who's email is " + email +" !");
        }

        return res;
    }

    public Student searchByAddress(String address){
        Student res = null;
        for(Student student : phonebook){
            if(student.getAddress()==address){
                res = student;
                break;
            }
        }
        if(res == null){
            System.out.println("Cannot find the Student who's address is " + address +" !");
        }

        return res;
    }

}
