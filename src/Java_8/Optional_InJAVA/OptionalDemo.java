package Java_8.Optional_InJAVA;

/*

    Optional -> Optional is a container object used to avoid null and prevent NullPointerException.
                It either contains a non-null value or is empty.

*/

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> name = name(1);

        // method of Optional object ->

        Optional<String> name1 = name.map(x -> x.toUpperCase());
        System.out.println(name1.get());

        String nameToBeUsed = name.orElse(null);
        System.out.println(nameToBeUsed);
                    //OR
        String nameToBeUsed1 = name.orElseGet(() -> {
            return null;
        });
        System.out.println(nameToBeUsed1);

        String nameToBeUsed2 = name.orElseThrow(() -> new NoSuchElementException());
        System.out.println(nameToBeUsed2);



        if(name.isPresent()){
            System.out.println(name.get());
        }

        name.ifPresent(System.out::println);

    }

    private static Optional<String> name(int id){

        String name = "Ram";
        return Optional.ofNullable(name); // ofNullable() means iske andr jo hum dere hai woh null bhi ho skta hai.

    }

}
