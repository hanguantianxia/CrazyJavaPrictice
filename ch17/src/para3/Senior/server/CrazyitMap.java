package para3.Senior.server;

import java.util.*;

public class CrazyitMap<K,V> {
    public Map<K,V> map = Collections.synchronizedMap(new HashMap<>());
    public synchronized void removeByValue(Object value){
        for (K key : map.keySet()){
            if (map.get(key) == value || map.get(key).equals(value)){
                map.remove(key);
                break;
            }
        }
    }

    public synchronized Set<V> valueSet(){
        Set<V> result = new HashSet<>();
        map.forEach((key, value) -> result.add(value));
        return result;
    }

    public synchronized K getKeyByValue(V val){
        for ( K key : map.keySet()){
            if (map.get(key) == val || map.get(key).equals(val)){
                return key;
            }
        }
        return null;
    }

    public synchronized V put(K key, V value){
        for (V val : valueSet()){
            if (val.equals(value) && val.hashCode() == value.hashCode()){
                throw new RuntimeException("MyMap Instance does NOT allow repeat value!");
            }
        }
        return map.put(key, value);
    }

}
