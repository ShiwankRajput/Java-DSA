package CollectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {

        /*


        List<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Egg");
        list.add("Bread");

        System.out.println(list);

        for(String item : list){
            if(item.equals("Egg")){
                list.add("Butter");
            }
        }

        System.out.println("Updated List -> " + list);


         */



        // this code will throw an exception as while reading a change in made in original array which can cause
        // problem for other thread which are reading the original array. Therefore we use, CopyOnWriteArrayList
        // as it makes copy of original array and make modification on copied array so that original array is
        // not modified as it is being reading by other threads.

        // we generally use CopyOnWriteArrayList when we need to perform more read than write operation.


        List<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("Milk");
        list1.add("Egg");
        list1.add("Bread");

        // loop will iterate on original array only, but modification are made on copied array
        for(String item : list1){
            if(item.equals("Egg")){
                list1.add("Butter");
            }
        }

        System.out.println("Updated List -> " + list1);

    }


}
