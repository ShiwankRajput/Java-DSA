package Java_8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // sequentialStream
        list.stream().forEach(x -> System.out.println(x + " " + Thread.currentThread().getName()));

        // parallelStream
        list.parallelStream().forEach(x -> System.out.println(x + " " + Thread.currentThread().getName()));



        /* example of parallel stream for large dataset -> */

        long startTime = System.currentTimeMillis();
        List<Integer> list1 = Stream.iterate(1, x -> x+1).limit(20000).toList();
        List<Long> list2 = list1.stream().map(ParallelStreamDemo::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by sequential Stream -> " + (endTime-startTime) + " ms");

        startTime = System.currentTimeMillis();
        list1 = Stream.generate(() -> 1).limit(20000).toList();
        list2 = list1.parallelStream().map(ParallelStreamDemo::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by sequential Stream -> " + (endTime-startTime) + " ms");

    }

    private static long factorial(int n){

        int fact=1;

        for(int i=2; i<=n; i++){
            fact = fact * i;
        }

        return fact;

    }

}
