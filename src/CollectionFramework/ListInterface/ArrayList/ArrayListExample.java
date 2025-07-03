package CollectionFramework.ListInterface.ArrayList;

import java.util.*;

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



        /*

        Comparator ->  In Java, Comparator is an interface used to define custom sorting logic for objects.
                        It is part of the java.util package.

         */

        ArrayList<Integer> list7 = new ArrayList<>();
        list7.add(1);
        list7.add(3);
        list7.add(2);

        list7.sort(new MyComparator1());  // for ascending
        System.out.println("Comparator list -> " + list7);
        list7.sort(new MyComparator2());  // for descending
        System.out.println("Comparator list -> " + list7);



        List<String> list8 = Arrays.asList("Shiwank","Dev","Tarang");
        list8.sort(new StringLengthComparator1());  // for ascending
        System.out.println("Comparator list -> " + list8);
        list8.sort(new StringLengthComparator2());  // for descending
        System.out.println("Comparator list -> " + list8);



        // using lambda expressions for sorting ->
        List<String> list9 = Arrays.asList("Shiwank","Tarang","Dev");
        list9.sort((a,b) -> b.length()-a.length());  // for descending
        System.out.println(list9);

    }

}


class MyComparator1 implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}

class MyComparator2 implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}

class StringLengthComparator1 implements Comparator<String>{

    public int compare(String o1, String o2){
        return o1.length() - o2.length();
    }

}

class StringLengthComparator2 implements Comparator<String>{

    public int compare(String o1, String o2){
        return o2.length() - o1.length();
    }

}