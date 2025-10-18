package Java_8.Streams.StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // collect
        List<Integer> list1 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(list1);

        // forEach
        list.stream().map(x -> x*2).forEach(System.out::println);

        // count
        long a = list.stream().filter(x -> x>3).count();
        System.out.println(a);

        // reduce
        long sum = list.stream().filter(x -> x%2 == 0).reduce(0, (x,y) -> x+y);
        System.out.println(sum);

        // anyMatch, allMatch, noneMatch
        boolean b1 = list.stream().anyMatch(x -> x>7);
        System.out.println(b1);

        boolean b2 = list.stream().allMatch(x -> x<7);
        System.out.println(b2);

        boolean b3 = list.stream().noneMatch(x -> x<0);
        System.out.println(b3);

        // findFirst, findAny
        int a1 = list.stream().findFirst().get();
        System.out.println(a1);

        int a2 = list.stream().findAny().get();
        System.out.println(a2);


        /*

            Examples -->

        */

        List<String> list2 = Arrays.asList("Shiwank", "Dev", "Raj","Tarang","Ravi");
        List<String> list3 = list2.stream().filter( x -> x.length()>3).toList();
        System.out.println(list3);

        List<Integer> list4 = Arrays.asList(5,2,9,1,6);
        List<Integer> list5 = list4.stream().map(x -> x*x).sorted().toList();
        System.out.println(list5);

        List<Integer> list6 = Arrays.asList(1,2,3,4,5);
        int sum1 = list6.stream().reduce(0,(x,y) -> x+y);
        System.out.println(sum1);

        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());  // chars() is equivalent to stream()



    }

}
