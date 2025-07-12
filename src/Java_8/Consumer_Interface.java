package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_Interface {

    public static void main(String[] args) {

        Consumer<String> listConsumer = x -> System.out.println(x);
        listConsumer.accept("Shiwank");

        Consumer<List<Integer>> listConsumer1 = li -> {
            for(int i : li){
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> listConsumer2 = li -> {
          for (int i : li){
              System.out.println(i+100);
          }
        };

        Consumer<List<Integer>> listConsumer3 = listConsumer1.andThen(listConsumer2);
        listConsumer3.accept(Arrays.asList(1,2,3,4,5,6));

    }

}
