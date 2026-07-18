package Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {-1,-32,0,78,65};
        System.out.println("SORTED ARRAY ---> " + Arrays.toString(bubbleSorting(arr)));

        int[] nums = {1,3,2,5,4};
        bubbleSortRecursion(nums, 0, 0);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] bubbleSorting(int[] arr){

        for(int i=1; i<=(arr.length-1); i++){

            boolean swapped = false;

            for(int j=0; j<(arr.length-i); j++){

                if(arr[j]>arr[j+1]){
                    swapped = true;
                    swap(arr, j, j+1);
                }
            }

            //if we do not swap for particular value of i it means that array is already sorted.
            if(!swapped){
                break;
            }

        }

        return arr;
    }

    public static void bubbleSortRecursion(int[] arr, int i, int j){

        if(i == arr.length-1){
            return;
        }

        if(j <= arr.length-i-2){

            if(arr[j] > arr[j+1]){
                swap(arr, j, j+1);
            }

            bubbleSortRecursion(arr, i, j+1);

        }

        bubbleSortRecursion(arr, i+1, 0);

    }

    public static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

}
