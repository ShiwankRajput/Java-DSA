package String.StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class StringBufferExample {

    public static void main(String[] args) {

        // types of constructor ->

        // constructor 1 :
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Shiwank");

        // constructor 2 :
        StringBuffer sb2 = new StringBuffer("Rajput");

        // constructor 3 :
        StringBuffer sb3 = new StringBuffer(30);


        /*

            different methods ->

         */
        StringBuffer sb = new StringBuffer();
        sb.append("Working with SpringBoot");
        sb.append(" is tricky/hard");
        sb.insert(12," Spring and");
        sb.replace(13,19, "Java");
        sb.delete(0,13);
        sb.reverse();

        String str = sb.toString();
        System.out.println(str);

        // removing whitespaces :
        String sentence = "What are you doing    today ?";
        System.out.println(sentence.replaceAll("\\s",""));

        // splitting string into array :
        String sentence1 = "Shiwank Kumar rajput";
        String[] names = sentence1.split(" ");
        System.out.println(Arrays.toString(names));


        /*

            [extends] :
            Object class -> Format class -> NumberFormat class -> Decimal Format class

         */

        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.28));


        /*

            Random class ->

         */
        Random randomNumber = new Random();
        System.out.println(randomNumber.nextFloat());


        String rs = RandomString.generator(10);
        System.out.println(rs);

    }

}

