package Arrays.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoD_ArrayList {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        ///initialisation (mtlb ek row mai ek particular arrayList ko exist karane ke liye)
        for (int i=0; i<3; i++){
            list1.add(new ArrayList<>());
        }

        //add elements
        for (int i=0; i<3 ;i++){
            for (int j=0; j<3; j++){
                list1.get(i).add(input.nextInt());
            }
        }
    }
}
