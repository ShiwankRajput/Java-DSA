package Arrays.Searching.BinarySearch.questions;

/*

GFG question -> floor in sorted array

Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less
than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.

*/


public class ImplementLowerBound {

    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;

        System.out.println(findFloor(arr,x));
    }

    static int findFloor(int[] arr, int x) {

        if (x < arr[0]) {
            return -1;  //if target is not found
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            //for multiple occurrences returning last occurence
            if (x >= arr[mid]) {
                start = mid + 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            }


        }

        return end;  //return the floor of a number.
    }
}
