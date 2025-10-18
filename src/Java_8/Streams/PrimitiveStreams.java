package Java_8.Streams;

import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStreams {

    public static void main(String[] args) {

        IntStream.range(1,5).forEach(System.out::println);
        IntStream.rangeClosed(1,5).forEach(System.out::println);

        int[] arr = {1,2,3,4,5,6};
        IntStream intStream = IntStream.of(arr);
        System.out.println(intStream.sum());

        int[] arr1 = {1,2,3};
        IntStream intStream1 = IntStream.of(arr1);
        System.out.println(intStream1.average().getAsDouble());

        // Primitive Stream -> Object Stream
        List<Integer> list = IntStream.rangeClosed(1,10).boxed().toList();



        /* similar for DoubleStream and LongStream */

    }

}
