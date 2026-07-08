package Arrays.Searching.BinarySearch_2D;

import java.util.*;

public class BinarySearch2D_Algo{

    public static void main(String[] args){

        int[][] arr = {{2,6,10,14,18},
                {20,24,27,29,38},
                {47,52,78,93,102},
                {108,111,200,218,320},
                {324,357,412,420,457}};

        System.out.println(Arrays.toString(binarySearchSol1(arr,111)));
        System.out.println(Arrays.toString(binarySearchSol2(arr,111)));
        System.out.println(Arrays.toString(binarySearchSol3(arr,111)));


        int[][] nums = {{4,8,15,25,60},
                {18,22,26,42,80},
                {36,40,45,68,104},
                {48,50,72,83,130},
                {70,99,114,128,170}};

        System.out.println(Arrays.toString(binarySearchSpecialSol3(nums,100)));

    }

    // Binary Search :-

    // (1) -> Leetcode 74 :-

    // (a) -> Solution 1 :-

    public static int[] binarySearchSol1(int[][] arr, int target){

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr[i].length; j++){

                if(arr[i][j] == target){
                    return new int[]{i,j};
                }

            }

        }

        return new int[]{-1,-1};

    }

    // (b) -> Solution 2 :-

    public static int[] binarySearchSol2(int[][] arr, int target){

        int colSize = arr[0].length;
        boolean entered = false;

        for(int i=0; i<arr.length; i++){

            if((arr[i][0] <= target) && (arr[i][colSize-1] >= target)){

                entered = true;

                int start = 0;
                int end = colSize-1;

                while(start <= end){
                    int mid = start + (end - start) / 2;

                    if(arr[i][mid] == target){
                        return new int[]{i, mid};
                    }
                    else if(target < arr[i][mid]){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }

            }

            if(entered){
                break;
            }

        }

        return new int[]{-1,-1};

    }

    // (c) -> Solution 3 :-

    public static int[] binarySearchSol3(int[][] arr, int target){

        int rowSize = arr.length;
        int colSize = arr[0].length;

        int start = 0;
        int end = (rowSize * colSize) - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            int rowIndex = mid / colSize;
            int colIndex = mid % colSize;

            if(arr[rowIndex][colIndex] == target){
                return new int[]{rowIndex, colIndex};
            }
            else if(target < arr[rowIndex][colIndex]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }

        return new int[]{-1,-1};

    }


    // (2) - Leetcode 240 :-

    // (a) - Solution 1 :- same as solution 1 of Leetcode 74

    // (b) - Solution 2 :- same as solution 2 of Leetocode 74, just remove the check of entered which breaks the outer loop.

    // (c) - Solution 3 :-

    public static int[] binarySearchSpecialSol3(int[][] arr, int target){

        int rowSize = arr.length;

        int i = 0;
        int j = arr[0].length - 1;

        while(i < rowSize && j >= 0){

            if(arr[i][j] == target){
                return new int[]{i, j};
            }
            else if(target < arr[i][j]){
                j--;
            }
            else{
                i++;
            }

        }

        return new int[]{-1,-1};

    }

}
