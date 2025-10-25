package Java_8;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalClassDemo {

    public static void main(String[] args) {


        // without Optional :
        String name = null;

        if(name != null){
            System.out.println(name.length());
        }


        // with Optional :
        Optional<String> optionalS = Optional.ofNullable(null);
        System.out.println(optionalS.orElse("No name Available"));


        /*

            Creating Optional object :-

        */

        // (1) - Creates an Optional with a non-null value:
        Optional<String> optionalS1 = Optional.of("Java");

        // (2) - Creates an Optional that may hold a null value
        Optional<String> optionalS2 = Optional.ofNullable(null);
        System.out.println(optionalS2.orElse("No name"));

        // (3) - Creates an empty Optional
        Optional<String> optionalS3 = Optional.empty();
        System.out.println(optionalS3.orElse("Empty Optional"));


        /*

            Common Optional Method :-

            | Method                | Description                               | Example                              |
            | --------------------- | ----------------------------------------- | ------------------------------------ |
            | `isPresent()`         | Returns `true` if value is present        | `opt.isPresent()`                    |
            | `isEmpty()`           | Returns `true` if no value (Java 11+)     | `opt.isEmpty()`                      |
            | `get()`               | Returns the value (throws error if empty) | `opt.get()`                          |
            | `orElse(default)`     | Returns value or default if empty         | `opt.orElse("Default")`              |
            | `orElseGet(Supplier)` | Returns value or runs supplier if empty   | `opt.orElseGet(() -> "Default")`     |
            | `orElseThrow()`       | Throws exception if no value              | `opt.orElseThrow()`                  |
            | `ifPresent(Consumer)` | Executes action if value present          | `opt.ifPresent(System.out::println)` |
            | `map(Function)`       | Transforms value if present               | `opt.map(String::toUpperCase)`       |
            | `filter(Predicate)`   | Keeps value only if condition true        | `opt.filter(s -> s.length() > 3)`    |


        */

        Optional<String> optionalS4 = Optional.ofNullable(null);
        System.out.println(optionalS4.orElse("value is not present"));

        Optional<String> optionalS5 = Optional.of("Shiwank");
        optionalS5.ifPresent(x -> System.out.println("Hello " + x));
        System.out.println(optionalS5.isEmpty());

        Optional<String> optionalS6 = Optional.of("java");
        optionalS6.map(String::toUpperCase)
                .filter(x -> x.startsWith("J"))
                .ifPresent(System.out::println);

        // note ->      //👉 orElse() always executes the method even if value present.
                        //👉 orElseGet() executes lazily (only if value is missing).

        Optional<String> optionalS7 = Optional.ofNullable("Shiwank");
        System.out.println(optionalS7.orElse(getDefault()));
        System.out.println(optionalS7.orElseGet(OptionalClassDemo::getDefault));


    }

    static String getDefault(){
        System.out.println("Generating default value");
        return "Default value generated";
    }

}
