import java.util.TreeSet;

class RC implements Comparable{
    int count;
    public RC(int count){
        this.count = count;
    }
    public String toString(){
        return "RC[ count: " + count + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return  true;
        }
        if(obj!=null && obj.getClass() == RC.class){
            RC r = (RC)obj;
            return this.count == r.count;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        RC r= (RC)o;
        return count > r.count ? 1: count < r.count ? -1:0;
    }
}
public class TreeSetTest3 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new RC(5));
        ts.add(new RC(-2));
        ts.add(new RC(9));
        ts.add(new RC(-3));

        System.out.println(ts);
    
        RC first = (RC)ts.first();
        first.count = 20;

        RC last = (RC)ts.last();
        
        last.count = -2;

        System.out.println(ts);

        System.out.println(ts.remove(new RC(-2)));

        System.out.println(ts);

        System.out.println(ts.remove(new RC(5)));
        System.out.println(ts);

    }
}
