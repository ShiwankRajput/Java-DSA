package Java_8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SequentialStreamCreation {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // before stream :
        for(int n : list){
            if(n%2 == 0){
                System.out.println(n*n);
            }
        }

        // after stream :
        list.stream().filter(num -> num%2 == 0).
                map(x -> x*x).
                forEach(System.out::println);


        /*

         Stream Creation ->

        */

        // (1) -> from Collection :
        List<String> list1 = Arrays.asList("Shiwank","Kumar","Rajput");
        Stream<String> stream = list1.stream();

        // (2) -> from Arrays :
        Integer[] arr = new Integer[]{1,2,3};
        Stream<Integer> stream1 = Arrays.stream(arr);

        // (3) -> from Stream.of() :
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);

        // (4) -> Infinite stream :
        Stream<Integer> stream3 = Stream.generate(() -> 1);
        Stream<Integer> stream4 = Stream.iterate(1,x -> x+1);



    }

}
