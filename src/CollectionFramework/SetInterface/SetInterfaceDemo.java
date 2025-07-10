package CollectionFramework.SetInterface;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetInterfaceDemo {

    public static void main(String[] args) {

        // Map -> hashmap, linkedHashMap, TreeMap, EnumMap
        // Set -> hashSet, linkedHashSet, TreeSet, EnumSet


        // (1) -> HashSet :
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Shiwank");
        hashSet.add("Dev");
        hashSet.add("Tarang");

        System.out.println(hashSet);


        // (2) -> LinkedHashSet :
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Shiwank");
        linkedHashSet.add("Dev");
        linkedHashSet.add("Tarang");

        System.out.println(linkedHashSet);


        // (3) -> TreeSet : (this also implements Navigable interface which extends SortedSet Interface and sortedSet extends Set Interface)
        NavigableSet<String> treeSet = new TreeSet<>();
        treeSet.add("Shiwank");
        treeSet.add("Dev");
        treeSet.add("Tarang");

        System.out.println(treeSet);
        System.out.println(treeSet.contains("Shiwank"));
        System.out.println(treeSet.isEmpty());
        System.out.println(treeSet.remove("Shiwank"));
        treeSet.clear();
        System.out.println(treeSet.isEmpty());
        for (String i : treeSet){
            System.out.println(i);
        }


        /*


            thread safety :-> the performance degrades with this, Collections.synchronizedSet() method therefore we use
                              ConcurrentSkipListSet.

            Set<String> treeSet1 = Collections.synchronizedSet(treeSet);

         */

        NavigableSet<Integer> set = new ConcurrentSkipListSet<>();   // this is already or built-in thread safe.


        /*

            Unmodifiable Set ->

         */

        Set<Integer> set1 = Set.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        System.out.println(set1);



        /*

            CopyOnWriteArraySet -

         */

        Set<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();
        Set<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i=0; i<=5; i++){
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet -> " + copyOnWriteSet);
        System.out.println("Initial concurrentSkipListSet -> " + concurrentSkipListSet);

        System.out.println("\n\nIterating and modifying the CopyOnWriteArraySet -> ");
        for (int num : copyOnWriteSet){
            System.out.println("Value = " + num);
            // attempting to modify during iteration
            copyOnWriteSet.add(6);
        }
        System.out.println(copyOnWriteSet);


        System.out.println("\n\nIterating and modifying the ConcurrentSkipListSet -> ");
        for (int num : concurrentSkipListSet){
            System.out.println("Value = " + num);
            // attempting to modify during iteration
            if (num == 4){
                concurrentSkipListSet.add(6);
            }
        }
        System.out.println(concurrentSkipListSet);


    }

}
