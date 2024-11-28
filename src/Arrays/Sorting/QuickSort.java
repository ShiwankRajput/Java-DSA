package Arrays.Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {4,6,2,5,7,9,1,3};

        System.out.println(Arrays.toString(fun(arr)));
    }

    static int[] fun(int[] arr){

        SortQuick(arr,0,arr.length-1);

        return arr;
    }

    static void SortQuick(int[] arr, int low, int high){

        if(low<high){
            int p = quick(arr,low,high);
            SortQuick(arr,low,p-1);
            SortQuick(arr,p+1,high);
        }

    }

    static int quick(int[] arr,int low ,int high){

        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                swap(arr,i,j);
            }
        }

        swap(arr,j,low);

        return j;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
