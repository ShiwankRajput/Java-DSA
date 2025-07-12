package Java_8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args) {

        Supplier<String> supplier1 = () -> "Shiwank";
        System.out.println(supplier1.get());

        Predicate<Integer> predicate = x -> x % 2 != 0;
        Supplier<Integer> supplier = () -> 3;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Function<Integer,Integer> function = x -> x * x;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }


    }

}
