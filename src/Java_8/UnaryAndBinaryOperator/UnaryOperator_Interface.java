package Java_8.UnaryAndBinaryOperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperator_Interface {

    public static void main(String[] args) {

        Function<Integer, Integer> function = x -> x + x;
        System.out.println(function.apply(4));

        // when input and output type reference are same then we can use UnaryOperator Interface as it extends
        // Function Interface.

        UnaryOperator<Integer> unaryOperator = x -> x + x;
        System.out.println(unaryOperator.apply(4));

    }

}
