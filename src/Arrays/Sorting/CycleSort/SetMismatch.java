package Arrays.Sorting.CycleSort;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {

        int[] arr = {1,1};

        System.out.println(Arrays.toString(setMismatch(arr)));
    }

    public static int[] setMismatch(int[] arr){

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

        //finding setMismatch
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                return new int[] {arr[j], j+1};
            }
        }

        return new int[] {-1,-1};
    }

    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
