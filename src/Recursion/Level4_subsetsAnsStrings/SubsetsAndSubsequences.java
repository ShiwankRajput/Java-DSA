package Recursion.Level4_subsetsAnsStrings;

import java.util.ArrayList;

public class SubsetsAndSubsequences {

    public static void main(String[] args) {

        newSubsets("","abc");
        System.out.printf("\n\n");
        System.out.println("Subsets of a String is ----> " +newSubsets1("","abc"));
    }

    //case1: including subsets of a string ---> process string within argument
    static void newSubsets(String p, String up){

        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        newSubsets(p+ch, up.substring(1));
        newSubsets(p, up.substring(1));
    }


    //case2: returning arrayList within function body
    static ArrayList<String> newSubsets1(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = newSubsets1(p+ch, up.substring(1));
        ArrayList<String> right = newSubsets1(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}
