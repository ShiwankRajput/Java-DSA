package Java_8.Streams.PracticeOnStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPractice_Set2 {

    public static void main(String[] args) {

        /*

            Java Stream API using primitive arrays (int[], double[], long[]) :-

            notes ->

            (1) - char[] array cannot be converted to stream, nor there is a concept of CharacterStream.

            (2) - Using IntStream for int[], LongStream for long[] and DoubleStream for double[]
            is more efficient as there is no requirement of boxing and unboxing.

        */

        // 1. Find sum of all elements in an array
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays
                .stream(arr).sum());


        // 2. Find average of elements
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays
                .stream(arr).average().orElse(0));


        // 3. Find maximum and minimum
        int[] arr2 = {1,2,3,4,5};
        int max = Arrays.stream(arr2).max().getAsInt();
        int min = Arrays.stream(arr2).min().getAsInt();

        System.out.println("Max : " + max +" and " + "Min : " + min);


        // 4. Filter even numbers
        int[] arr3 = {1,2,3,4,5,6,7,8,9};
        int[] evenNumbers = Arrays
                .stream(arr3)
                .filter(x -> x%2 == 0)
                .toArray();
        System.out.println(Arrays.toString(evenNumbers));


        // 5. Sort elements in ascending order
        char[] arr4 = {'c','d','a','b','k','f'};
        char[] sortedArray;

        // 6. Multiply each element by 2
        int[] arr5 = {1,2,3,4,5};
        IntStream stream = IntStream.of(arr5);
        int[] mulArray = stream
                .map(x -> x*2)
                .toArray();
        System.out.println(Arrays.toString(mulArray));


        // 7. Count numbers greater than 10
        IntStream stream1 = IntStream.of(9,11,15,17,5,3);
        System.out.println(stream1
                .filter(x -> x>10)
                .count());


        // 8. Check if all elements are positive
        IntStream stream2 = IntStream.of(-1,6,4,-9,4);
        System.out.println(stream2.allMatch(x -> x>=0));

        // similar questions -
        IntStream stream3 = IntStream.of(-1,6,4,-9,4);
        System.out.println(stream3.anyMatch(x -> x>=0));
        IntStream stream4 = IntStream.of(-1,6,4,-9,4);
        System.out.println(stream4.noneMatch(x -> x>=0));

        // 9. Find distinct elements
        IntStream stream5 = IntStream.of(1,2,9,2,8,9,6,2,4,6);
        System.out.println(Arrays
                .toString(stream5
                        .distinct()
                        .toArray()));

        // 10. Find product of all elements
        IntStream stream6 = IntStream.of(1,2,3,4,5);
        System.out.println(stream6.reduce(1, (a,b)->a*b));


        // 11. Reverse the elements of an array
        int[] arr7 = {1,2,3,4,5};
        int[] reversedArray = IntStream.range(0,arr7.length)
                .map(i -> arr7[arr7.length-1-i])
                .toArray();
        System.out.println(Arrays.toString(reversedArray));


        // 12. Find second highest element
        IntStream stream7 = IntStream.of(6,4,9,1,0,3,7,2,5,9,2);
        System.out.println(stream7
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow());


        // 13. Count how many numbers are prime
        IntStream stream8 = IntStream.of(1,2,3,4,5,6,7,8,9);
        System.out.println(Arrays.toString(stream8
                .filter(StreamsPractice_Set2::isPrime)
                .toArray()));


        // 14. Find median of array
        IntStream stream9 = IntStream.of(3,1,5,2,4,6);
        int[] sortedArray1 = stream9.sorted().toArray();

        int median = sortedArray1.length%2 == 0 ?
                (sortedArray1[sortedArray1.length/2] + sortedArray1[(sortedArray1.length/2) - 1])/2
        : sortedArray1[sortedArray1.length/2];

        System.out.println("Median of array = " + median);


        // 15.Find frequency of each element
        IntStream stream10 = IntStream.of(2,6,3,7,3,9,2,8,4,6,1,4,8);
        Map<Integer, Long> map = stream10
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        System.out.println(map);


        // 16. Convert int[] to comma-separated String
        int[] arr8 = {1,2,3,4,5};
        String string = Arrays.stream(arr8)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Array combined string = " + string);
        System.out.println(string.getClass().getName());


        // 17. Find sum of squares of all elements
        IntStream stream11 = IntStream.of(1,2,3,4,5);
        int sum = stream11.map(x -> x*x).sum();
        System.out.println("Sum of all elements in array = " + sum);


        // 18. Merge two arrays and remove duplicates
        int[] arr9 = {5,7,3,8,1,4,1,7,4};
        int[] arr10 = {1,5,2,6,8};

        int[] mergedArray = IntStream.concat(IntStream.of(arr9), IntStream.of(arr10))
                .distinct()
                .toArray();

        System.out.println("Merged array -> " + Arrays.toString(mergedArray));


        // 19. Generate first 10 even numbers using Stream
        int[] evenArray = IntStream
                .iterate(2, x->x+2)
                .limit(10)
                .toArray();
        System.out.println("Even number Array -> " + Arrays.toString(evenArray));


        // 20. Check if array is sorted
        int[] arr11 = {1,2,3,4,5,0};
        boolean sortedOrNot = IntStream.range(0,arr11.length-1)
                .allMatch(i -> arr11[i] < arr11[i+1]);

        System.out.println("Array sorted or not -> " + sortedOrNot);


    }

    private static boolean isPrime(int n){

        for(int i=2; i<n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;

    }

}
