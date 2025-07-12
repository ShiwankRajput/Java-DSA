package Java_8.UnaryAndBinaryOperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperator_Interface {

    public static void main(String[] args) {

        BiFunction<String,String,String> biFunction = (str1, str2) -> str1 + str2;
        System.out.println(biFunction.apply("Shiwank ", "Kumar"));

        // if input and output type reference are same in BiFunction interface then we use Binary Operator
        // interface as it also extends BiFunction.

        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Shiwank ", "Rajput"));

    }

}
