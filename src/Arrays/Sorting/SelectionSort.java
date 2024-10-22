package Arrays.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {-1,-32,67,0,43,54,33,23,12};

        System.out.println("SELECTION SORTED ARRAY ----> " + Arrays.toString(selectionSorting(arr)));
    }

    public static int[] selectionSorting(int[] arr){

        //outer loop for passes to find the maximum in each step and swap it with it's right index.
        for(int i=0; i<arr.length-1; i++){

            int lastIndex = arr.length-i-1;  //this is the last index with which we swap a value.
            int max = 0;  //we choose max at first index and then compare it with others

            //this loop finds max considering that largest element is at last.
            for(int j=1; j<=arr.length-i-1; j++){
                if(arr[max]<arr[j]){
                    max = j;
                }
            }

            swap(arr,max,lastIndex);  //swap largest element with it's correct place
        }

        return arr;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
