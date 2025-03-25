package Recursion.Level4_subsetsAnsStrings;

import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {

        findingPermutation("","abc");

        System.out.printf("\n\n");

        ArrayList<String> arr = findingPermutation1("","abc");
        System.out.println(arr);
        System.out.println("And number of permutations are --> " + arr.size());
    }

    //without using arrayList -->
    static void findingPermutation(String p, String up){

        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        for (int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            findingPermutation(f+ch+s,up.substring(1));
        }
    }

    //using arrayList within function body--->
    static ArrayList<String> findingPermutation1(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(findingPermutation1(f+ch+s,up.substring(1)));
        }

        return ans;
    }
}
