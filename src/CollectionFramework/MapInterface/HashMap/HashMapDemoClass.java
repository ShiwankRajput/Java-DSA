package CollectionFramework.MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemoClass {

    public static void main(String[] args) {

        // Performance -> O(n)

        HashMap<Integer, String> map = new HashMap<>();

        map.put(3,"Shiwank");
        map.put(5,"Dev");
        map.put(1,"Tarang");

        // methods of hashmap ->
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(10));
        System.out.println(map.containsKey(11));
        System.out.println(map.containsValue("Shiwank"));

        //looping -->

        // 1->
        Set<Integer> keys = map.keySet();
        for(int i : keys){
            System.out.println(i + " : " + map.get(i));
        }

        System.out.println();

        // 2->
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> i : entries){
            System.out.println(i.getKey() + " : " + i.getValue());
        }

        for(Map.Entry<Integer,String> i : entries){
            i.setValue(i.getValue().toUpperCase());
        }
        System.out.println(map);



        //remove method ->

        map.remove(5);
        System.out.println(map);

        boolean isRemoved = map.remove(10,"Shiwank");
        System.out.println("Removed ? " + isRemoved);
        System.out.println(map);


    }

}
