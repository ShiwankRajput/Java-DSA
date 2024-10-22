package Arrays.Sorting.CycleSort;

// https://leetcode.com/problems/find-the-duplicate-number/

/*

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n]
inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

Example 1:
Input: nums = [1,3,4,2,2]
Output: 2

Example 2:
Input: nums = [3,1,3,4,2]
Output: 3

Example 3:
Input: nums = [3,3,3,3,3]
Output: 3


 */

import java.util.Arrays;

public class find_Duplicate {

    public static void main(String[] args) {

        int[] arr = {1,1};

        System.out.println(Duplicate(arr));

    }

    public static int Duplicate(int[] arr){

        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }

        //find a duplicate element
        int j=0;
        while(j<arr.length){
            if(arr[j] != j+1){
                return arr[j];
            }
            else{
                j++;
            }
        }

        return -1;
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
