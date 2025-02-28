package Arrays.basics.question;

/*

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the
non-zero elements.

Note that you must do this in-place without making a copy of the array.

*/

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr ={0,1,0,3,12};

        System.out.println(Arrays.toString(move(arr)));
        System.out.println(Arrays.toString(OptimalMove(arr)));

    }

    static int[] move(int[] arr){

        if(arr.length == 1){
            return arr;
        }

        int i=0;

        while(i<arr.length-1){
            if(arr[i+1] == 0){
                i++;
                continue;
            }

            if(arr[i]==0 && arr[i+1]!=0){
                swap(arr,i,i+1);
                if(i>0 && arr[i-1]==0){
                    i--;
                    continue;
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }

        return arr;
    }

    static int[] OptimalMove(int[] arr){

        //two pointer approach

        int j=0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] != 0){
                swap(arr,i,j);
                j++;
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
