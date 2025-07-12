package Java_8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateConsumerFunction {

    public static void main(String[] args) {

        BiPredicate<String, Integer> biPredicate = (x,y) -> x.length() == y;
        System.out.println(biPredicate.test("Shiwank",7));

        BiConsumer<String,String> biConsumer = (x,y) -> System.out.println(x+y);
        biConsumer.accept("Shiwank ","Kumar");

        BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> ((x+y) % 10);
        System.out.println(biFunction.apply(7,9));

        // There is no BiSupplier as we know that function returns only a single value.

    }

}
