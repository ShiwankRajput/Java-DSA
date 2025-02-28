package Arrays.basics.question;

/*

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated
some number of positions (including zero). Otherwise, return false. There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that
B[i] == A[(i+x) % A.length] for every valid index i.

*/



public class SortedAndRotated {

    public static void main(String[] args) {

        int[] arr = {3,5,4,1,2};

        System.out.println(check(arr));

    }

    static boolean check(int[] arr){

        int count = 0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }

        if(arr[arr.length-1] > arr[0]){
            count++;
        }

        if(count<=1){
            return true;
        }

        return false;
    }
}
