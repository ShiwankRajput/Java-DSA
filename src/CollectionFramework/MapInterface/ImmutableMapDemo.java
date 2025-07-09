package CollectionFramework.MapInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(11,"Apple");
        map.put(10,"Orange");
        map.put(6,"Banana");
        System.out.println(map);

        // Method 1 ->

        Map<Integer,String> map1 = Collections.unmodifiableMap(map);
        System.out.println(map1);
        // map1.put(6,"Guava");  // throws an exception as ImmutableMap cannot be modified.


        // Method 2 ->

        Map<Integer,String> map2 = Map.of(11,"Apple",10,"Orange",5,"Guava");
        System.out.println(map2);


        // Method 3 ->

        Map<Integer,String> map3 = Map.ofEntries(Map.entry(11,"Apple"),Map.entry(10,"Orange"),Map.entry(5,"Guava"));
        System.out.println(map3);

    }

}
