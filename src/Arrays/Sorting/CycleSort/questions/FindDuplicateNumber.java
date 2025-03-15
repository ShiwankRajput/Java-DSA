package Arrays.Sorting.CycleSort.questions;

//https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicateNumber {

    public static void main(String[] args) {

        int[] arr = {3,3,3,3,3,3};

        System.out.println("Duplicate number is -> " + findDuplicate(arr));
    }

    static int findDuplicate(int[] nums){

        //apply cyclic sort
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if((nums[i] != i+1) && (nums[correctIndex] != nums[i])){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        //finding duplicate element
        for(int j=0 ; j<nums.length; j++ ){
            if(nums[j] != (j+1)){
                return nums[j];
            }
        }

        return -1;  //if no duplicate is present in the array nums
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
