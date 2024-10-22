package Arrays.Sorting.CycleSort;

// https://leetcode.com/problems/first-missing-positive/


import java.util.Arrays;

public class smallestMissing_positiveNum {

    public static void main(String[] args) {

        int[] arr = {1};

        System.out.println(cycleSort(arr));
    }

    public static int cycleSort(int[] arr){

        int i=0;
        while(i<arr.length){
            if(arr[i]<=0 || arr[i]>=arr.length){
                i++;
            }
            else{
                int correctIndex = arr[i]-1;
                if(arr[i] != arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }
                else{
                    i++;
                }
            }

        }

        return missing_positive(arr);
    }

    //finding smallest missing positive number
    public static int missing_positive(int[] arr){

        for(int i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }

        return arr.length+1;
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
