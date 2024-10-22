package Arrays.Sorting.CycleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CycleSort {

    public static void main(String[] args) {

        int[] arr = {2,5,4,6,1,3};

        System.out.println("CYCLIC SORTED ARRAY ----> " + Arrays.toString(CyclicSort(arr)));

    }

    public static int[] CyclicSort(int[] arr){

        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
