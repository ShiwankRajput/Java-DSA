package String.StringBuilders;

public class Basics {

    public static void main(String[] args) {

        //here string pool is used to store objects that are pointed by two or more different variable.
        String a = "Shiwank";
        String b = "Shiwank";

        System.out.println(a==b);  //true
        System.out.println(a.equals(b));  //checks value of the variable, i.e true

        //creating different objects of String
        String name1 = new String("abc");
        String name2 = new String("abc");

        System.out.println(name1 == name2);  //false,because it points to different object not
        // pointed to same value in string pool.
        System.out.println(name1.equals(name2));   //true


        //pretty Printing
        float c = 3456.85309329f;
        System.out.printf("Formatted number is %.2f",c);

        System.out.printf("PI : %.2f",Math.PI);
    }
}
