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

        // 11: Filter names longer than 4 characters
        List<String> list10 = Arrays.asList("Shiwank","Dev","Tarang","Shaksham","Ravi");
        System.out.println(list10
                .stream()
                .filter(x -> x.length()>4)
                .toList());

        // 12: Convert a Set to sorted List
        Set<String> set = new HashSet<>(Arrays.asList("Shiwank","Dev","Tarang"));
        List<String> names = set.stream()
                .sorted()
                .toList();
        System.out.println("Sorted names -> " + names);

        // 13: Find total length of all strings in a list
        List<String> list11 = Arrays.asList("Shiwank","Raj","Ravi","Himanshu","Vishnoi");
        int totalLength = list11
                .stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Total length of all Strings -> " + totalLength);

        // 14: Create a Map of word and its length
        List<String> list12 = Arrays.asList("Shiwank","Raj","Ravi","Himanshu","Vishnoi");
        Map<String, Integer> map1 = list12.stream()
                .collect(Collectors.toMap(x->x, String::length));
        System.out.println(map1);


        // 15: Count frequency of each element in a list
        List<Integer> list13 = Arrays.asList(1,4,6,2,8,6,9,1,3,2,5,3,5,7,8,9,3);
        Map<Integer, Long> map2 = list13.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(map2);


        // 16: Get list of keys from a Map
        Map<Integer, String> map3 = Map.of(1,"A",2,"B",3,"C",4,"D");
        System.out.println(map3.keySet()
                .stream()
                .toList());

        // 17: Filter Map entries by value
        Map<String, Integer> map4 = Map.of("Ram", 85, "Sita", 92, "Ravi", 60);
        Map<String, Integer> map5 = map4.entrySet().stream()
                .filter(x -> x.getValue()>=65)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map5);


        // 18: Find the longest string in a list
        List<String> list14 = Arrays.asList("Shiwank","Dev","Raj","Ravi");
        String longest = list14.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("No value");
        System.out.println("Longest String -> " + longest);


        // 19: Flatten list of lists
        List<List<Integer>> list15 = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        System.out.println(list15.stream()
                .flatMap(Collection::stream)
                .toList());


    }

}
