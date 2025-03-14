package Arrays.Sorting.CycleSort;

import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println("Sorted array -> " + Arrays.toString(cyclicSorting(arr)));
    }

    static int[] cyclicSorting(int[] arr){

        int i = 0;

        while(i<arr.length){
            if(arr[i] != i+1 && arr[i]!=arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
            else{
                i++;
            }
        }

        return arr;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
