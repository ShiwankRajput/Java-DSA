package Recursion.Level4_subsetsAnsStrings;

import java.util.ArrayList;

public class NumberOfDiceRoll {

    public static void main(String[] args) {

        diceRoll("",4,6);

        System.out.printf("\n\n");

        System.out.println(diceRoll1("",4,6));
    }

    static void diceRoll(String p, int target,int face){

        if(target == 0){
            System.out.print(p+" ");
            return;
        }

        for (int i=1; i<=face && i<=target; i++){

            diceRoll(p+i,target-i,face);
        }

    }

    static ArrayList<String> diceRoll1(String p, int target, int face){

        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i=1; i<=face && i<=target; i++){

            list.addAll(diceRoll1(p+i,target-i,face));
        }

        return list;

    }

}
