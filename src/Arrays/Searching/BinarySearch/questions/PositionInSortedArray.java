package Arrays.Searching.BinarySearch.questions;

import java.util.Arrays;

public class PositionInSortedArray {

    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,8,9,10};
        int x = 11;

        System.out.println(Arrays.toString(searchRange(arr,x)));

    }


    static int[] searchRange(int[] arr, int x){

        if(arr.length == 0){
            return new int[]{-1,-1};
        }

        int a = firstPosition(arr,x);
        int b = lastPosition(arr,x);

        return new int[]{a,b};
    }


    //finding firstPosition of element.
    static int firstPosition(int[] arr, int x){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (x > arr[mid]) {
                start = mid+1;
            }
            else if (arr[mid] >= x) {
                end = mid - 1;
            }


        }

        // if target is greater or smaller or not found
        if((x>arr[arr.length-1] || x<arr[0]) || arr[start] != x){
            return -1;
        }

        return start;

    }



    // finding lastPosition of target element.
    static int lastPosition(int[] arr, int x) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (x >= arr[mid]) {
                start = mid+1;
            }
            else if (arr[mid] > x) {
                end = mid - 1;
            }


        }

        // if target is greater or smaller or not found
        if((x>arr[arr.length-1] || x<arr[0]) || arr[end] != x){
            return -1;
        }

        return end;

    }

}
