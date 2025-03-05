package Arrays.Searching.BinarySearch.questions;

//finding targeted element in the rotated array (with distinct element)....

public class Search_RotatedArray {
    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        int pivot = Find_pivot(arr);
        System.out.println("pivot is found at -> " + pivot);

        System.out.println("Element is present at -> " + search(arr,target,pivot));

    }

    public static int search(int arr[],int target,int pivot){

        if (arr[pivot] == target) {
            return pivot;
        } else if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }

    }

    public static int Find_pivot(int arr[]){

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(mid>end && arr[mid]>arr[mid+1] ){
                return mid;
            }
            else if(mid<end && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>arr[mid]){
                end = mid-1;
            }
            else if(arr[start]<=arr[mid]){
                start = mid+1;
            }
        }

        return -1;
    }

    public static int binarySearch(int arr[],int target, int start ,int end){

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }


//    public static int Find_pivot_withDuplicate(int arr[]) {
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] > arr[mid + 1]) {
//                return mid;
//            } else if (arr[mid] < arr[mid - 1]) {
//                return mid - 1;
//            }
//
//            //skip the duplicate is start,end,and mis are duplicate
//            if(arr[start]==arr[mid] && arr[mid]==arr[start]){
//
//                //skip the duplicate
//                //NOTE : if start and end are pivot??
//                //check if start is pivot
//                if(arr[start]>arr[start+1]){
//                    return start;
//                }
//                start++;
//            }
//        }
//
//        return -1;
//    }


}
