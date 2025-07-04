package CollectionFramework.ListInterface.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(10);
        System.out.println(list.get(2));
        list.addFirst(11);  // 0(1)
        list.addLast(15);   // 0(1)
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.remove();
        list.remove(1);
        System.out.println(list);
        list.removeIf(x -> x%2 != 0);
        System.out.println(list);

        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("Dog","Cat","Elephant"));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("Cat","Dog"));
        list1.removeAll(list2);
        System.out.println(list1);

    }

}
