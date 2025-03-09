package Arrays.Searching.BinarySearch.questions;

public class SearchInMountainArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println("target is present at index => " + findIndex(arr,target));
    }

    static int findIndex(int[] arr, int target){

        int peak = peakIndex(arr);

        int assArray = binarySearch(arr,target,0,peak);
        if(assArray != -1){
            return assArray;
        }

        return binarySearch(arr,target,peak+1,arr.length-1);

    }


    //finding peak so that array divides into two.
    static int peakIndex(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while(start<end){

            int mid = start + (end-start)/2;

            if(nums[mid]>nums[mid+1]){  //you are in decreasing array.
                end = mid;
            }
            else if(nums[mid]<nums[mid+1]){  //you are in increasing array.
                start = mid+1;
            }
        }

        return start;

    }


    //for searching element....
    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target && arr[mid] != arr[mid + 1]) {
                return mid;
            }
            if (arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }

}
