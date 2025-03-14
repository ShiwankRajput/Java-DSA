package Arrays.Sorting.CycleSort.questions;

//https://leetcode.com/problems/missing-number/description/

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr = {0,1,2};

        System.out.println("Missing Number in array -> " + missingNumber(arr));

    }

    static int missingNumber(int[] arr){

        //apply cyclic sort
        int i = 0;

        while(i<arr.length){
            if(arr[i]!=i && arr[i]<arr.length){
                swap(arr,i,arr[i]);
            }
            else{
                i++;
            }
        }


        //find missing number
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }

        return arr.length; //if all the elements are in its correct position.
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
