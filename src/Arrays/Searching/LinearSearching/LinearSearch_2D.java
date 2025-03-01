package Arrays.Searching.LinearSearching;

import java.util.Arrays;

public class LinearSearch_2D {

    public static void main(String[] args) {

        int[][] arr = {
                {56,23,2},
                {76,9,12,54},
                {23,10,67,73,82}
        };

        int target = 73;

        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int target){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length ;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
}
