package Recursion.Level2_PatternQuestions.BubbleSort;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,1,2};

        bubbleSort(arr,0,0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr,int i,int j){

        if(i == arr.length-1){
            return;
        }

        if(j<arr.length-i-1){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
            }

            bubbleSort(arr,i,j+1);
        }
        else{
            bubbleSort(arr,i+1,0);
        }

    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
