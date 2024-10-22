package Arrays.Searching.LinearSearching;

import java.util.Arrays;

public class TwoD_LinearSearch {
    public static void main(String[] args) {

        int[][] arr = {
                {45,5,24,76,13},
                {35,56,3},
                {90,29,57,49}
        };
        int target = 1;

        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int target){

        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
