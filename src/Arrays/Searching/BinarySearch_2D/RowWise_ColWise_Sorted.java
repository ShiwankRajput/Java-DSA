package Arrays.Searching.BinarySearch_2D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RowWise_ColWise_Sorted {

    public static void main(String[] args) {

        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int target = 37;

        System.out.println("Element is found at index -> " + Arrays.toString(searchTarget(arr,target)));
        
    }

    static int[] searchTarget(int[][] arr, int target){

        int r = 0;
        int c = arr.length-1;

        while(r<arr.length && c>=0){

            if(arr[r][c] == target){
                return new int[]{r,c};
            }

            else if(target<arr[r][c]){
                c--;
            }

            else if(target>arr[r][c]){
                r++;
            }
        }

        return new int[]{-1,-1};

    }
}
