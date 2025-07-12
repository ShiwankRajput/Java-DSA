package Java_8.PredicateInterface;

/*

    Predicate -> (1) Boolean valued function
                 (2) It is an Interface

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateInterfaceDemo {

    public static void main(String[] args) {

        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        System.out.println(isEven.test(15));
        System.out.println(isEven.test(10));


        Predicate<String> startWithA = s -> s.toLowerCase().startsWith("a");

        System.out.println(startWithA.test("Shiwank"));
        System.out.println(startWithA.test("Apple"));


        // Predicates with streams -->

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isOdd = (n) -> n%2 != 0;
        List<Integer> data = list.stream().filter(isOdd).toList();

        System.out.println(data);


        // or, and , isEqual and negate -->

        Predicate<String> startsWithV = s -> s.toLowerCase().startsWith("v");
        Predicate<String> endsWithL = s -> s.toLowerCase().endsWith("l");

        Predicate<String> OR = startsWithV.or(endsWithL);  // or
        System.out.println(OR.test("Vipul"));
        System.out.println(OR.test("Shiwank"));

        Predicate<String> AND = startsWithV.and(endsWithL);  // and
        System.out.println(AND.test("Vipul"));
        System.out.println(AND.test("Vijay"));
        
        System.out.println(startsWithV.negate().test("Vipul"));   // negate

        Predicate<String> predicate = Predicate.isEqual("Shiwank");   // isEqual
        System.out.println(predicate.test("shiwank"));




    }

}
