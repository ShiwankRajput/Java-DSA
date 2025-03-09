package Arrays.Searching.BinarySearch.questions;

//https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition {

    public static void main(String[] args) {

        int[] arr = {1,3,5,6};
        int target = 7;

        System.out.println(insertPosition(arr,target));

    }

    static int insertPosition(int[] nums, int target){

        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;  //if element is found, there is no need to find insert position.
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }

        return start;  //index where we can insert element.
    }
}
