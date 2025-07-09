package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        // iterator overcome CopyOnWriteArray as it first write on copy and then update but it directly update.
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()){
            int i = itr.next();
            if(i % 2 == 0){
                itr.remove();
            }
        }

        System.out.println(list1);


    }

}
