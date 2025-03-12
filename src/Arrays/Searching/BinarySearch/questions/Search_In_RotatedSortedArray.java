package Arrays.Searching.BinarySearch.questions;

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/


public class Search_In_RotatedSortedArray {

    public static void main(String[] args) {

        int[] nums = {3,5,1};
        int target = 3;

        System.out.println("Pivot(largest) in array is present at index -> " + pivot(nums));
        System.out.println("Element is present at index -> " + searchTarget(nums,target));

    }

    static int searchTarget(int[] nums, int target){

        int pivotIndex = pivot(nums);
        if(pivotIndex == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        else if(nums[pivotIndex] == target){
            return pivotIndex;
        }
        else if(target >= nums[0]){
            return binarySearch(nums,target,0,pivotIndex-1);
        }

        return binarySearch(nums,target,pivotIndex+1, nums.length-1);

    }

    static int pivot(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            else if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[start] >= nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1; //if pivot is not found, array is not rotated but it is sorted.
    }


    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){

            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;   //if element is not found;
    }

}
