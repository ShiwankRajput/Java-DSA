package Arrays.Searching.BinarySearch.questions;

public class PositionInSortedArray {

    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,8,9,10};
        int x = 9;

        System.out.println(firstPosition(arr,x));
        System.out.println(lastPosition(arr,x));
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

        return end;

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

        return start;

    }
}
