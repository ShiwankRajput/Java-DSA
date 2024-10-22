package Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {-1,-32,0,78,65};

        System.out.println("SORTED ARRAY ---> " + Arrays.toString(bubbleSorting(arr)));

    }

    public static int[] bubbleSorting(int[] arr){

        int temp = 0;
        boolean swapped;

        for(int i=1; i<=(arr.length-1); i++){
            swapped = false;

            for(int j=0; j<(arr.length-i); j++){

                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            //if we do not swap for particular value of i it means that array is already sorted.
            if(swapped == false){
                break;
            }

        }

        return arr;
    }
}
