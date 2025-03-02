package String_StringBuilders.questions;

/*

 You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that
 is a non-empty substring of num, or an empty string "" if no odd integer exists. A substring is a contiguous
 sequence of characters within a string.



*/

import java.math.BigInteger;

public class LargestOddNumber {

    public static void main(String[] args) {

        String num = "35427";

        System.out.println(StringOddNumber(num));
        System.out.println(StringOddNumber1(num));
    }

    static String StringOddNumber(String num){

        if(Integer.parseInt(num)%2 != 0){
            return num;
        }

        int b = 0;

        for (int i=0; i<num.length(); i++){
            int a = Character.getNumericValue(num.charAt(i));
            if(a%2 != 0){
                if(b<a){
                    b = a;
                }
            }
        }

        if(b == 0){
            return "";
        }

        return String.valueOf(b);
    }


    static String StringOddNumber1(String num){

        for(int i=num.length()-1; i>=0; i--){
            char ch = num.charAt(i);
            if(Character.getNumericValue(ch)%2 != 0){
                return num.substring(0,i+1);
            }
        }

        return "";
    }
}
