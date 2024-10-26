package String_StringBuilders;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {

        System.out.println('a' + 'b');  //195
        System.out.println("a" + "b");  //ab
        System.out.println('a' + 3);  //100
        System.out.println((char)('a' + 3));   //d
        System.out.println("a" + 3);  //3 is converted to string type using toString()  ,i.e a3

        System.out.println("Shiwank " + "Rajput");

        System.out.println("Shiwank" + new ArrayList<>());
        System.out.println("Shiwank" + new Integer(56));
        /* System.out.println(new Integer(56) + new ArrayList<>()); */      /* this will give error
        because '+'  operator(concatenation) works only when there exists atleast one string.
        Thus, does not add two or more complex objects. */

        System.out.println(new Integer(56) + "" + new ArrayList<>());  //56[]

    }
}
