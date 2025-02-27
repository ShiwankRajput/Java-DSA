package Arrays.basics.question;

import java.util.Arrays;

/*

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

*/

public class RotatedArray {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        System.out.println(Arrays.toString(rotate(nums,k)));
    }

    static int[] rotate(int[] nums,int k){

        int[] arr2 = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            arr2[(i+k) % nums.length] = nums[i];
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = arr2[i];
        }

        return nums;
    }

}
