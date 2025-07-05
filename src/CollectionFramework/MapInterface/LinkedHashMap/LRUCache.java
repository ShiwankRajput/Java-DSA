package CollectionFramework.MapInterface.LinkedHashMap;

// LRUCache = Least recently Used Cache ->

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {


    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f, true);
        this.capacity = capacity;
    }

    // as soon as the element is inserted greater than the capacity then this method will call automatically.
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        LRUCache<String,Integer> studentMap = new LRUCache<>(2);
        studentMap.put("Shiwank",1);
        studentMap.put("Dev",2);
        System.out.println(studentMap.get("Shiwank"));
        studentMap.put("Tarang",3);
        studentMap.put("Vishal",4);

        System.out.println(studentMap);

    }

}
