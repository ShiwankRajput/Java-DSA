package CollectionFramework.MapInterface.HashMap.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // In linkedHashmap order of data is maintained as we insert item (accessOrder = false)->
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(10,0.5f,true);

        linkedHashMap.put("Shiwank",1);
        linkedHashMap.put("Tarang",2);
        linkedHashMap.put("Dev",3);


        /*

         if (accessOrder = true) follow below conditions

         */


        // where you get an item then linkedHashMap uses (least recently used) principle and moves
        // item to last of insertion order so that it is easily to remove item that is not recently used.
        System.out.println(linkedHashMap.get("Shiwank"));

        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        for(Map.Entry<String, Integer> i : entries){
            System.out.println(i.getKey() + " : " + i.getValue());
        }


        //passing hashmap in linkedHashMap -->
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Shiwank",1);
        map1.put("Tarang",2);

        LinkedHashMap<String, Integer> linkedMap1 = new LinkedHashMap<>(map1);
        System.out.println(linkedMap1);


        // some methods of hashMap -->
        Integer result = map1.getOrDefault("Dev",0);
        System.out.println(result);

    }

}
