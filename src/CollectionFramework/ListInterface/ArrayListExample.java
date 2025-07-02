package CollectionFramework.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(50);
        list1.add(60);
        list1.add(70);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(2,25);
        list.set(2,26);
        list.remove(2);
        list.addAll(list1);
        list.removeAll(list1);

        System.out.println(list.size());
        System.out.println(list.contains(5));
        System.out.println(list.get(2));

        System.out.println(list);

        for(int num : list){
            System.out.print(num+" ");
        }


        /*

        Methods for creating ArrayList -->

         */

        // 1 ->
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list2.getClass().getName());

        // 2 ->
        List<String> list3 = Arrays.asList("Monday","Tuesday");
        // list3.add(1,"Sunday");   can't be used for Arrays.asList
        System.out.println(list3);
        System.out.println(list3.getClass().getName());

        // 3 ->
        String[] arr = {"Monday","Tuesday"};
        List<String> list4 = Arrays.asList(arr);

        // 4 ->
        List<Integer> list5 = List.of(1,2,3,4);
        System.out.println(list5);


        /*

        Sort method ->

         */

        ArrayList<Integer> list6 = new ArrayList<>();
        list6.add(4);
        list6.add(9);
        list6.add(1);

        System.out.println(list6);
        // Collections.sort(list6);
        list6.sort(null);  // null is comparator
        System.out.println(list6);


    }

}
