package Arrays.basics.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PairSum {

    public static void main(String[] args) {

        int[] arr = {2,-3,3,-3,-2};
        int s = 0;

        ArrayList<int[]> pair = sum(arr,s);

        for(int[] a:pair){
            System.out.println(Arrays.toString(a));
        }
    }

    static ArrayList<int[]> sum(int[] arr, int s){

        ArrayList<int[]> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j]) == s){
                    list.add(new int[]{
                            Math.min (arr[i], arr[j]),
                            Math.max (arr[i], arr[j])
                    });
                }
            }
        }

        Collections.sort(list, (a, b) -> a[0] - b[0]);

        return list;
    }
}
