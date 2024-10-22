//https://leetcode.com/problems/missing-number/

package Arrays.Sorting.CycleSort;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {1,0,2};

        System.out.println("Missing element in array ----> " + findMissingNumber(arr));


    }

    public static int findMissingNumber(int[] arr){

        //sorting on the basis of array
        int i=0;
        while(i<arr.length){

            if(arr[i]<arr.length && arr[i] != i){
                int j = arr[i];
                swap(arr,i,j);
            }
            else{
                i++;
            }
        }

        //finding missing
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j){
                return j;  //case1
            }
        }

        //case 2
        return arr.length;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
