package String_StringBuilders;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String name = "Shiwank Kumar";

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.charAt(3));  //w
        System.out.println("    sh   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
