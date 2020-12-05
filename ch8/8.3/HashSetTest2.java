import java.util.HashSet;
import java.util.Iterator;

class R{
    int count;
    public R(int count){
        this.count = count;
    }
    public String toString(){
        return "R[count: " + count + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj != null && obj.getClass() == RC.class){
            RC r = (RC)obj;
            return this.count == r.count;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}
public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new RC(5));
        hs.add(new RC(-3));
        hs.add(new RC(9));
        hs.add(new RC(-2));

        System.out.println(hs);

        Iterator it = hs.iterator();
        RC first = (RC)it.next();
        first.count = -3;
        System.out.println(hs);
        hs.remove(new RC(-3)); // delete one R
        System.out.println(hs);
        System.out.println("HashSet is contain R object whose count var equals -3" +
        hs.contains(new RC(-3)));
        System.out.println("HashSet is contain R object whose count var equals -2" + 
        hs.contains(new RC(-2)));
    }    
}
