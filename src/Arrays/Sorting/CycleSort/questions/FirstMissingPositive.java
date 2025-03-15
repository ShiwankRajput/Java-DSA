package Arrays.Sorting.CycleSort.questions;

//https://leetcode.com/problems/first-missing-positive/

//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] arr = {1,1};

        System.out.println("Smallest missing positive number -> " + findMissingPositive(arr));
    }

    static int findMissingPositive(int[] nums){

        //apply cycle sort
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;

            if(correctIndex<nums.length && nums[i]>0 && nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else {
                i++;
            }
        }

        //finding smallest missing positive number
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }

        return nums.length+1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
