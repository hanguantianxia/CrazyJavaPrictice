
class CacheImmutale{
    private static final int MAX_SIZE = 100;
    private static CacheImmutale[] cache = new CacheImmutale[MAX_SIZE];

    private static int pos = 0;
    private final String name;
    private CacheImmutale(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static CacheImmutale valueOf(String name) {
        // traverce cached object
        for(int i=0;i<MAX_SIZE;i++){
            if (cache[i]!=null && cache[i].getName().equals(name)) {
                return cache[i];
            }
        }
        if (pos==MAX_SIZE){
            cache[0] = new CacheImmutale(name);
            pos = 1;
        }
        else{
            cache[pos++] = new CacheImmutale(name);
        }
        return cache[pos-1];
    }

    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj!=null && obj.getClass() == CacheImmutale.class){
            CacheImmutale ci = (CacheImmutale) obj;
            return name.equals(ci.getName());
        }
        return false;
    }

    public int hashCode() {
        return name.hashCode();
    }
}
public class CacheImmutaleTest {
    public static void main(String[] args) {
        CacheImmutale c1 = CacheImmutale.valueOf("Hello");
        CacheImmutale c2 = CacheImmutale.valueOf("Hello");
        System.out.println(c1==c2);
    }
}
