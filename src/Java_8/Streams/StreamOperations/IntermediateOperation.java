package Java_8.Streams.StreamOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {

    public static void main(String[] args) {

        // Some of the intermediate operations of stream are ->

        List<Integer> list = Arrays.asList(8,6,5,4,3,1,2,7,9,1);

        Stream<Integer> stream = list.stream().filter(x -> x%2 != 0);
        Stream<Integer> stream1 = list.stream().map(x -> x*2);
        Stream<Integer> stream2 = list.stream().sorted();
        Stream<Integer> stream3 = list.stream().distinct();
        Stream<Integer> stream4 = list.stream().limit(5);
        Stream<Integer> stream5 = list.stream().skip(5);


    }

}
