package Arrays.Searching.BinarySearch.questions;

import java.util.Arrays;

public class Position_SortedArray {
    public static void main(String[] args){

        int[] arr = {5,6,7,7,7,7,8,8,8,8,10};
        int target = 6;

        System.out.println("First and last occurence of target element > " + Arrays.toString(first_last_occ(arr,target)));

    }

    static int[] first_last_occ(int[] arr,int target){

        int first = firstOcc(arr,target);
        int last = lastOcc(arr,target);

        return new int[]{first,last};
    }


    //finding first occurence
    static int firstOcc(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==arr[mid]){
                ans = mid;
                end = mid-1;
            }
            else if (target>arr[mid]) {
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
        }

        return ans;
    }

    //finding last occurence...
    static int lastOcc(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target==arr[mid]){
                ans = mid;
                start = mid+1;
            }
            else if (target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
        }

        return ans;
    }

}
