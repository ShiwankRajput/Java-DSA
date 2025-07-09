package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("Shiwank",11);
        hashtable.put("Dev",13);
        hashtable.put("Tarang",20);
        System.out.println(hashtable);
        System.out.println("Roll number of Shiwank -> " + hashtable.get("Shiwank"));
        System.out.println("Is Shiwank present ? " + hashtable.containsKey("Shiwank"));

        // null is not allowed as key and value, thus throw Exception

        /*

            hashtable.put(null,15);
            hashtable.put("Rana", null);

         */

        hashtable.remove("Shiwank");
        System.out.println("Hashtable after removing key Shiwank -> " + hashtable);


        // hashtable are synchronised, eg;
        Hashtable<Integer, String> hashtable1 = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
            for (int i=1; i<=1000; i++){
                hashtable1.put(i, "Thread");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i=1001; i<=2000; i++){
                hashtable1.put(i, "Thread2");
            }
        });

        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Size of hashTable -> " + hashtable1.size());



    }

}
