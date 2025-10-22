package Java_8.Streams.PracticeOnStreams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsPractice_Set1 {

    public static void main(String[] args) {

        /*

            Java Stream API using collections

        */

        // 1: Filter even numbers from a list
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream()
                .filter(x -> x%2 == 0)
                .forEach(x -> System.out.print(x + " "));


        // 2: Convert list of strings to uppercase
        List<String> list1 = Arrays.asList("Shiwank", "Ravi", "Ajay", "Gurpreet");
        System.out.println(list1
                .stream()
                .map(String::toUpperCase)
                .toList());


        // 3: Find squares of numbers greater than 5
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list2
                .stream()
                .filter(x -> x>5)
                .map(x -> x*x)
                .toList());


        // 4: Count strings starting with a specific letter
        List<String> list3 = Arrays.asList("Shiwank","Raj","Ravi","Ajay","Saksham","Sarthak");
        System.out.println(list3
                .stream()
                .filter(x -> x.startsWith("S"))
                .count());


        // 5: Sort a list using streams
        List<Character> list4 = Arrays.asList('c','e','b','a','d');
        System.out.println(list4
                .stream()
                .sorted()
                .toList());


        // 6: Find the maximum number
        List<Integer> list5 = Arrays.asList(5,8,2,6,1,9,3,4,7);
        System.out.println(list5
                .stream()
                .max(Comparable::compareTo)
                .get());


        // 7: Sum of all numbers
        List<Integer> list6 = Arrays.asList(1,2,3,4,5);
        System.out.println(list6
                .stream()
                .reduce(0, Integer::sum));


        // 8: Remove duplicates
        List<Character> list7 = Arrays.asList('a','c','a','d','b','e','d');
        System.out.println(list7
                .stream()
                .distinct()
                .toList());


        // 9: Group strings by their length
        List<String> list8 = Arrays.asList("Shiwank","Raj","Ravi","Dev","Amit","Ajay","Shaksham","Sarthak");
        Map<Integer, List<String>> map = list8
                .stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);


        // 10: Find first element greater than 50
        List<Integer> list9 = Arrays.asList(10, 20, 60, 80, 30);
        System.out.println(list9
                .stream()
                .filter(x -> x>50)
                .findFirst().orElseThrow());

    }

}
