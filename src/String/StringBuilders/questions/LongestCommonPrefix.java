package String.StringBuilders.questions;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flight","flow","flower"};

        System.out.println(longest(strs));
    }

    static String longest(String[] strs){

        Arrays.sort(strs);
        String s = strs[0];
        String t = strs[strs.length-1];

        int i = 0;
        while(i<s.length()){
            if(s.charAt(i) == t.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }

        return i==0 ? "" : s.substring(0,i);
    }
}
