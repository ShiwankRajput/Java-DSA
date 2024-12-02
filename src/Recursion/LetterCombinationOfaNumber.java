package Recursion;

import java.util.ArrayList;

public class LetterCombinationOfaNumber {

    public static void main(String[] args) {

        letterCombination("","12");
        System.out.println(letterCombination1("","12"));
        System.out.println(letterCombinationCount("","12"));
    }

    static void letterCombination(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        int digit = Character.getNumericValue(c);

        for(int i=(digit-1)*3; i<(digit*3); i++){
            char ch = (char)('a'+i);
            letterCombination( p+ch, up.substring(1));
        }
    }


    static ArrayList<String> letterCombination1(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);
        int digit = Character.getNumericValue(c);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=(digit-1)*3; i<(digit*3); i++){
            char ch = (char)('a'+i);
            ans.addAll(letterCombination1(p + ch, up.substring(1)));
        }

        return ans;
    }


    static int letterCombinationCount(String p, String up){

        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        char c = up.charAt(0);
        int digit = Character.getNumericValue(c);

        for(int i=(digit-1)*3; i<(digit*3); i++){
            char ch = (char)('a'+i);
            count = count + letterCombinationCount( p+ch, up.substring(1));
        }

        return count;
    }
}
