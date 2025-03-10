/* Binary search with agnostic order(means if the order is not decided whether it is
ascending or descending) */


package Arrays.Searching.BinarySearch;

import java.util.Scanner;

public class BinarySearchAlgo {

    public static void main(String[] args) {

        int[] arr = {11,18,24,26,56,60,98,99};
        int target = 26;

        System.out.print("Element is present at index -> " + binarySearch(arr,target));

    }


    //binary search in 1D array --->

    static int binarySearch(int[] arr,int target){
         int start = 0;
         int end = arr.length-1;

         while(start<=end){

             int mid = (start+end)/2;

             if(arr[mid] == target){
                return mid;
             }

             //if array is sorted in ascending order.....
             if(arr[start]<arr[end]){
                 if (target<arr[mid]) {
                    end = mid-1;
                 }
                 else {
                    start = mid+1;
                 }
             }

             //if array is sorted in descending order.....
             else {
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
