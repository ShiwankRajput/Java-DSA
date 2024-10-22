package Arrays.Searching.BS_in2D;

import java.util.Arrays;

public class RowSorted_ColSorted {

    public static void main(String[] args) {

        int[][] arr = {
                {10,12,16,28},
                {14,17,18,30},
                {21,25,29,35},
                {23,27,36,40},
        };

        int target = 25;

        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search (int[][] arr,int target){

        int r = 0;
        int c = arr.length-1;

        while(r<arr.length && c>=0){

            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            else if (target>arr[r][c]) {
                r++;
            }
            else if (target<arr[r][c]){
                c--;
            }
        }

        return new int[]{-1,-1};
    }
}
