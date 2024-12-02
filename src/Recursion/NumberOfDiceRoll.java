package Recursion;

import java.util.ArrayList;

public class NumberOfDiceRoll {

    public static void main(String[] args) {

        targetSum("",4);
        System.out.println(targetSum1("",4));
    }

    static void targetSum(String p, int target){

        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=target; i++){
            targetSum(p+i,target-i);
        }
    }


    static ArrayList<String> targetSum1(String p, int target){

        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i=1; i<=6 && i<=target; i++){
            ans.addAll(targetSum1(p+i,target-i));
        }

        return ans;
    }
}
