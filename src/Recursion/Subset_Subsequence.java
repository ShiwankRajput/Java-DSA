package Recursion;

import java.util.ArrayList;

public class Subset_Subsequence {

    public static void main(String[] args) {

        subsets("","abc");
        System.out.println();
        System.out.println(subsets1("","abc"));
    }

    static void subsets(String p, String up){

        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        subsets(p+ch,up.substring(1));
        subsets(p,up.substring(1));
    }

    //subsets with arraylist in the function
    static ArrayList<String> subsets1(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subsets1(p+ch,up.substring(1));
        ArrayList<String> right = subsets1(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
