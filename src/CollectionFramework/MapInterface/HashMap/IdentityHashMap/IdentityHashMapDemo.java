package CollectionFramework.MapInterface.HashMap.IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String[] args) {

        String key1 = new String("Key");
        String key2 = new String("Key");

        Map<String, Integer> map = new HashMap<>();
        map.put(key1,1);
        map.put(key2,2);

        System.out.println("map key equal ? " + key1.equals(key2));
        System.out.println("map" + map);
        System.out.println("map size ? " + map.size());

        // hashmap first checks the hashcode method of class(string ke pass apna hot hai method jo ki content ko dekhta hai)
        // mentioned in diamond operator, if that class does not have its own hashcode method then hashmap class runs
        // method of object class.
        // Therefore, we can say that hashcode for object key1 and key2 will be same, and it will replace the value
        // due to which map reference would have size as 1. To resolve this problem we use IdentityHashMap<>();
        // where IdentityHashMap only checks the method of object class not any another class due to which
        // it generates hashcode for same literals as different

        System.out.println();

        // key1 and key2 are created by different object there hashcode will be different even if there have
        // same value inside and here .equals() will check reference not the content
        Map<String, Integer> map1 = new IdentityHashMap<>();
        map1.put(key1,1);
        map1.put(key2,2);
        System.out.println("map1 key equals ? " + key1.equals(key2));
        System.out.println("map1" + map1);
        System.out.println("map1 size ? " + map1.size());

        System.out.println();

        // key is used as literal as we have not created object differently therefore now same hashcode will be
        // generated and value of key will be replaced from 1 to 2 just like hashMap above.
        Map<String, Integer> map2 = new IdentityHashMap<>();
        map2.put("Key",1);
        map2.put("Key",2);
        System.out.println("map2 key equals ? " + key1.equals(key2));
        System.out.println("map1" + map2);
        System.out.println("map2 size ? " + map2.size());

        System.out.println();


        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

    }

}
