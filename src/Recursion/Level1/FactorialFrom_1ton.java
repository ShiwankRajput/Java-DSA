package Recursion.Level1;

import java.util.ArrayList;

public class FactorialFrom_1ton {

    public static void main(String[] args) {

        long n = 3;
        ArrayList<Long> list1 = new ArrayList<>();

        for(int i=1; i<=n; i++){
            ArrayList<Long> list = new ArrayList<>();

            ArrayList<Long> ans = helper(i,list);

            if(ans.get(0)<=n){
                list1.addAll(ans.get(0));
            }

        }

        System.out.println(list1);


    }


    static ArrayList<Long> helper(long n, ArrayList<Integer> list){

        if(n==0){
            ArrayList<Long> val = new ArrayList<>();
            val.add(1);
        }

        return helper(n-1,list )*n;

    }
}
