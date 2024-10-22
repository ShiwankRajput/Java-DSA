/* Binary search with agnostic order(means if the order is not decided whether it is
ascending or descending) */


package Arrays.Searching.BinarySearch;

import java.util.Scanner;

public class BinarySearchAlgo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.println("Enter array elements in sorted  order -> ");
        for (int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Enter element you want to search -> ");
        int target = input.nextInt();

        System.out.print("Element is present at index -> " + binarySearch(arr,target));

    }

    static int binarySearch(int[] arr,int target){
         int start = 0;
         int end = arr.length-1;

         while(start<=end){

             int mid = (start+end)/2;

             if(arr[mid] == target){
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
