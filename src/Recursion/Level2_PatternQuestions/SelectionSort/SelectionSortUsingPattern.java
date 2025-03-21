package Recursion.Level2_PatternQuestions.SelectionSort;

import java.util.Arrays;

public class SelectionSortUsingPattern {

    public static void main(String[] args) {

        int[] arr = {5,3,7,21,9,26,1};

        sort(arr,0,arr.length,0);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr,int max,int r,int c){

        if(r==0){
            return arr;
        }

        if(c < r-1){
            if(arr[max] < arr[c+1]){
                max = c+1;
                return sort(arr,max,r,c+1);
            }
            else{
                return sort(arr,max,r,c+1);
            }
        }

        swap(arr,max,r-1);
        return sort(arr,0,r-1,0);
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
