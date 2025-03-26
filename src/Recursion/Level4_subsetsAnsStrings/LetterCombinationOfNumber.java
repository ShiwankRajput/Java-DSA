package Recursion.Level4_subsetsAnsStrings;

import java.util.ArrayList;

public class LetterCombinationOfNumber {

    public static void main(String[] args) {

        letterCombination2("","12");

        System.out.printf("\n\n");

        ArrayList<String> ans = letterCombination1("","23");
        System.out.print(ans);

        System.out.printf("\n\n");

        System.out.println(letterCombination("","23"));

    }

    static void letterCombination2(String p,String up){

        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        int digit = up.charAt(0) - '0';

        for (int i=((digit)-1)*3 ; i<(digit*3) ; i++){

            if(i == 26){
                continue;
            }

            char ch = (char) ('a' + i);

            letterCombination2(p+ ch ,up.substring(1));
        }
    }


    static ArrayList<String> letterCombination1(String p, String up){

        if(up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for (int i=((digit)-1)*3 ; i<(digit*3) ; i++){

            if(i == 26){
                continue;
            }

            char ch = (char) ('a' + i);

            ans.addAll( letterCombination1(p+ ch ,up.substring(1)) );
        }

        return ans;
    }


    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/

    static ArrayList<String> letterCombination(String p, String up){

        if(up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        if(digit == 1){

            ans.addAll( letterCombination(p, up.substring(1)) );

        }
        else if(digit == 7){
            for (int i=((digit)-2)*3 ; i<=((digit-1)*3) ; i++){

                char ch = (char) ('a' + i);

                ans.addAll( letterCombination(p+ ch ,up.substring(1)) );
            }

        }
        else if(digit == 8){
            for (int i=(((digit)-2)*3) + 1 ; i<=((digit-1)*3) ; i++){

                char ch = (char) ('a' + i);

                ans.addAll( letterCombination(p+ ch ,up.substring(1)) );
            }

        }
        else if(digit == 9){
            for (int i=(((digit)-2)*3) +1 ; i<=(((digit-1)*3)) +1 ; i++){

                char ch = (char) ('a' + i);

                ans.addAll( letterCombination(p+ ch ,up.substring(1)) );
            }

        }
        else{

            for (int i=((digit)-2)*3 ; i<((digit-1)*3) ; i++){

                char ch = (char) ('a' + i);

                ans.addAll( letterCombination(p+ ch ,up.substring(1)) );
            }


        }

        return ans;

    }


}

