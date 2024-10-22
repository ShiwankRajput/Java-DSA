package Arrays.Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {-1,0,-32,67,23,12,7};

        System.out.println("Inserion sorting array ----> " + Arrays.toString(insertionSorting(arr)));
    }

    public static int[] insertionSorting(int[] arr){

        //outer loop for passes
        for(int i=0; i<arr.length-1; i++){

            //inner loop for comparisons
            for(int j=i+1; j>0; j--){

                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
