import java.util.HashMap;
import java.util.Map;

public class MapTest{
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("Crazy Java", 108);
        map.put("Crazy iOS", 103);
        map.put("Crazy Ajax", 128);
        
        map.put("Java EE", 231);

        System.out.println(map.put("Crazy IOS", 88));
        System.out.println(map);
    
        System.out.println("contain crazy ios textbook key:" + map.containsKey("Crazy iOS"));
        System.out.println("contain value 103" + map.containsValue(103));
        
        for (Object key : map.keySet()) {
            System.out.println(key + "-->"  +map.get(key));
        }
        map.remove("Crazy Ajax");
        System.out.println(map);
    }
}