package Arrays.basics.question;

import java.util.Arrays;

public class swapAlternates {

    public static void main(String[] args) {

        int[] arr = {1,2,7,8,5};

        for (int i=0; i<arr.length; i=i+2){
            if (i == arr.length-1){
                break;
            }
            else {
                swap(arr,i,i+1);
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
