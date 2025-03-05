package Arrays.Searching.BinarySearch.questions;

public class PeakElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,4,3,1};

        System.out.println("Peak Element in the array is at the index -> " + peakElement(arr));
    }

    public static int peakElement(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){

            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }

        }

        return start;  //or return end;
    }
}
