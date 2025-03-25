package Recursion.Level3_PatternQuestions.SelectionSort;

import java.util.Arrays;

public class recursiveSelectionSort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,1,2};

        selectionSort(arr,0,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static int[] selectionSort(int[] arr, int max, int i, int j){

        if(i == arr.length-1){
            return arr;
        }

        if(j<arr.length-i-1){
            if(arr[max]<arr[j+1]){
                max = j+1;
            }

            return selectionSort(arr,max,i,j+1);
        }

        swap(arr,max,arr.length-i-1);

        return selectionSort(arr,0,i+1,0);

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
