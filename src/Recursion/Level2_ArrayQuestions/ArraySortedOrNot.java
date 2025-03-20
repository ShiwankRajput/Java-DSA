package Recursion.Level2_ArrayQuestions;

public class ArraySortedOrNot {

    public static void main(String[] args) {

        int[] arr = {1,2,4,8,12,9};
        System.out.println("Array is sorted ? -< " + checkSorted(arr,0));

    }

    static boolean checkSorted(int[] arr, int i){

        if(i == arr.length-1){
            return true;
        }

        if(arr[i]<arr[i+1] && checkSorted(arr,i+1)){
            return true;
        }

        return false;
    }
}
