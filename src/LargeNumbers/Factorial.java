package LargeNumbers;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger fact(int num){

        BigInteger result = new BigInteger("1");

        for (int i=2; i<=num; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;

    }

}
