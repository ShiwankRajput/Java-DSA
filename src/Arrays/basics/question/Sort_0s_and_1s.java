package Arrays.basics.question;

import java.util.Arrays;

public class Sort_0s_and_1s {

    public static void main(String[] args) {

        int[] arr = {0,0,1,1,1,0};
        int i = 0;
        int j = arr.length-1;

        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort1(arr,i,j)));

    }

    static int[] sort(int[] arr){

        int[] arr2 = new int[6];
        int k = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                arr2[k] = arr[i];
                k++;
            }
        }

        for(int i=0; i<arr.length ; i++){
            if(arr[i]==1){
                arr2[k] = arr[i];
                k++;
            }
        }

        return arr2;
    }


    //two-pointer approach
    static int[] sort1(int[] arr,int i, int j){

        while (i<j){

            while(arr[i] == 0 && i<j){
                i++;
            }
            while(arr[j] == 1 && i<j){
                j--;
            }
            if(arr[i]==1 && arr[j]==0 && i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return arr;
    }
}
