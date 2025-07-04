package CollectionFramework.ListInterface.Vectors;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        // They are 4 different constructors of vectors ->
        Vector<Integer> v1 = new Vector<>(3,2);
        v1.add(4);
        v1.add(5);
        v1.add(10);
        System.out.println(v1.capacity());
        v1.add(11);
        System.out.println(v1.capacity());

        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("Shiwank","Dev","Tarang"));
        System.out.println(list1);
        Vector<String> v2= new Vector<>(list1);
        System.out.println(v2);


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(5);

        // methods of vectors ->
        Vector<Integer> v3 = new Vector<>();
        v3.add(4);
        v3.add(0,7);
        v3.addAll(list2);
        System.out.println(v3);
        v3.set(0,9);
        System.out.println(v3.get(0));
        v3.remove(0);
        System.out.println(v3);
        System.out.println(Arrays.toString(v3.toArray()));
        System.out.println(v3);

    }

}
