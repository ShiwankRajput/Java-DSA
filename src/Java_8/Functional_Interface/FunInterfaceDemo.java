package Java_8.Functional_Interface;

import java.util.function.*;

public class FunInterfaceDemo {

    public static void main(String[] args) {

        // Some Built-in Functional Interface :

        // (1) -> Predicate

        Predicate<String> predicate = s -> s.length()%2 == 0;
        System.out.println(predicate.test("Shiwank"));

        // (2) -> Consumer

        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Shiwank");

        // (3) -> Supplier

        Supplier<Integer> supplier = () -> 1;
        System.out.println(supplier.get());

        // (4) -> Function

        Function<String, Integer> function = s -> s.length();
        System.out.println(function.apply("Shiwank"));

        // (5) -> BiFunction

        BiFunction<String, String, Integer> biFunction = (a,b) -> a.length()+b.length();
        System.out.println(biFunction.apply("Shiwank","Rajput"));

        // (6) -> UnaryOperator : If function interface has same input and output

        UnaryOperator<Integer> unaryOperator = x -> x*2;
        System.out.println(unaryOperator.apply(3));

        // (7) -> BinaryOperator : If BiFunction has both same type of input and same type of output

        BinaryOperator<String> binaryOperator = (a,b) -> a + " " + b;
        System.out.println(binaryOperator.apply("Shiwank","Rajput"));

    }

}
