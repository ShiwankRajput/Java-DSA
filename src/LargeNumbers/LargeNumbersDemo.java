package LargeNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeNumbersDemo {

    public static void main(String[] args) {

        /*

            BigInteger :-

         */


        int a = 30;
        int b = 45;

        BigInteger g = new BigInteger("1226487398984974729749823472");
        BigInteger h = new BigInteger("73897328478917481274891274871248217489");
        BigInteger c = BigInteger.valueOf(30);
        BigInteger d = BigInteger.valueOf(45);
        System.out.println(c);

        // constants :
        BigInteger e = BigInteger.ZERO;
        System.out.println(e);

        // operations :
        BigInteger addition = g.add(h);
        System.out.println(addition);

        BigInteger subtraction = g.subtract(h);
        System.out.println(subtraction);

        BigInteger mul = g.multiply(h);
        System.out.println(mul);

        BigInteger div = g.divide(h);
        System.out.println(div);

        BigInteger rem = g.remainder(h);
        System.out.println(rem);

        if(g.compareTo(h) > 0){
            System.out.println("Greater than 0");
        }

        BigInteger ans = Factorial.fact(100);
        System.out.println(ans);




        /*

            BigDecimal :-

         */


        double num1 = 0.03;
        double num2 = 0.04;
        System.out.println(num2-num1);

        BigDecimal bigNum1 = new BigDecimal("0.03");
        BigDecimal bigNum2 = new BigDecimal("0.04");

        System.out.println(bigNum2.subtract(bigNum1));


    }

}
