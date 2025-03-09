/* Binary search with agnostic order(means if the order is not decided whether it is
ascending or descending) */


package Arrays.Searching.BinarySearch;

import java.util.Scanner;

public class BinarySearchAlgo {

    public static void main(String[] args) {

        int[] arr = {4, 15, 17, 17, 19, 20, 21, 22, 22, 25, 26, 26, 26, 28, 28, 28, 31, 31, 32, 33, 34, 34, 35,
                36, 36, 37, 38, 38, 39, 41, 41, 42, 43, 43, 44, 44, 45, 45, 46, 47, 49, 49, 50, 50,
                50, 51, 53, 54, 54, 56, 57, 58, 58, 59, 60, 64, 67, 69, 75, 94};
        int target = 26;

        System.out.print("Element is present at index -> " + binarySearch(arr,target));

    }

    static int binarySearch(int[] arr,int target){
         int start = 0;
         int end = arr.length-1;

         while(start<=end){

             int mid = (start+end)/2;

             if(arr[mid] == target && arr[mid] != arr[mid+1]){  //this case returns last index of target;
                return mid;
             }

             if(arr[start]<arr[end]){            //for ascending
                 if (target<arr[mid]) {
                    end = mid-1;
                 }
                 else {
                    start = mid+1;
                 }
             }
             
             else {                             //for descending
                 if(target<arr[mid]){
                    start = mid+1;
                 }
                 else {
                    end = mid-1;
                 }
             }

         }

         return -1;
    }
}
