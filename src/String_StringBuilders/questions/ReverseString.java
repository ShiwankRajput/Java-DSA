package String_StringBuilders.questions;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String s = "shiwank";

        System.out.println(reverse(s));
    }

    static String reverse(String s){

        char[] ch = s.toCharArray();

        int i=0;
        int j=s.length()-1;

        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        return String.valueOf(ch);
    }

}
