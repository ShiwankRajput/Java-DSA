package Arrays.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCollection {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>(5);
        list1.add(53);
        list1.add(43);
        list1.add(25);
        list1.add(56);
        list1.add(78);
        list1.add(89);
        list1.add(34);
        System.out.println(list1);
        list1.set(1,34);
        System.out.println(list1);
        System.out.println(list1.get(0));


        ArrayList<String> list2 = new ArrayList<>(5);

        System.out.println("Enter String ArrayList => ");
        for(int i=0; i<=6; i++){
            list2.add(input.next());
        }

        System.out.print("printing string ArrayList => ");
        for (int i=0; i<=6; i++){
            System.out.print(list2.get(i) + " ");
        }

    }
}
