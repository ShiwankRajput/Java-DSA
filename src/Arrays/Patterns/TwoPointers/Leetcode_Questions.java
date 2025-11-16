package Arrays.Patterns.TwoPointers;

import java.util.*;


public class Leetcode_Questions {

    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println("Two Sum II -> " + Arrays.toString(twoSum(numbers,target)));

        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Container with most water -> " + maxArea(height));

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println("3 Sum -> " + threeSum(nums));

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

    // (3) -> [Three Sum]
    // https://leetcode.com/problems/3sum/
    public static List<List<Integer>> threeSum(int[] nums) {


        // (2) - Better solution

        /* TC = O(n^2), SC = O(n)

            Set<List<Integer>> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for(int i=0; i<nums.length; i++){
                set2.clear();
                for(int j=i+1; j<nums.length; j++){
                    int num = -(nums[i]+nums[j]);
                    if(set2.contains(num)){
                        List<Integer> result = Arrays.asList(nums[i],nums[j],num);
                        Collections.sort(result);
                        set1.add(result);
                    }
                    else{
                        set2.add(nums[j]);
                    }
                }
            }

            List<List<Integer>> ans = new ArrayList<>(set1);

            return ans;

        */


        // (1) - Brute force solution

        /*  TC = O(n^3), SC = O(n)

            Set<List<Integer>> set = new HashSet<>();

            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    for(int k=j+1; k<nums.length;k++){
                        if(nums[i]+nums[j]+nums[k] == 0){
                            List<Integer> result = Arrays.asList(nums[i],nums[j],nums[k]);
                            Collections.sort(result);
                            set.add(result);
                        }
                    }
                }
            }

            List<List<Integer>> ans = new ArrayList<>(set);

            return ans;

        */

        return null;

    }

}
