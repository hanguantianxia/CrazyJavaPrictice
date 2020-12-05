import java.util.TreeSet;

class Z implements Comparable{
    int age;
    public Z(int age){
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
public class TreeSetTest2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        Z z1 = new Z(5);
        set.add(z1);

        System.out.println(set.add(z1));
        System.out.println(set);

        System.out.println(((Z)(set.last())).age);
    }
}
