package Arrays.Patterns.TwoPointers;

import java.util.Arrays;


public class Leetcode_Questions {

    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println("Two Sum II -> " + Arrays.toString(twoSum(numbers,target)));

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Container with most water -> " + maxArea(height));

    }

    // (1) -> [Two Sum II ]
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public static int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length-1;

        while(start < end){

            if((numbers[start] + numbers[end]) == target){
                return new int[]{start+1, end+1};
            }
            else if((numbers[start] + numbers[end]) > target){
                end--;
            }
            else{
                start++;
            }

        }

        return new int[]{-1,-1};

    }


    // (2) -> [Container with most water]
    // https://leetcode.com/problems/container-with-most-water/description/
    public static int maxArea(int[] height) {

        int start = 0;
        int end = height.length-1;
        int area = 0;
        int maxArea = Integer.MIN_VALUE;

        if(height.length == 2){
            return Math.min(height[start], height[end]);
        }

        while(start < end){

            area = Math.min(height[start], height[end]) * (end-start);

            if(area > maxArea){
                maxArea = area;
            }

            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }

        }

        return maxArea;

    }

}
