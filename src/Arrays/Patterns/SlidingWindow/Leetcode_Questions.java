package Arrays.Patterns.SlidingWindow;

import java.util.HashSet;

public class Leetcode_Questions {

    public static void main(String[] args) {

        String str = "AABABBA";
        System.out.println("Character Replacement -> " + characterReplacement(str,1));

        int[] nums = {1,1,1,1,1,1,1,1};
        System.out.println("Minimum Size SubArray Sum -> " + minSubArrayLen(11,nums));

        int[] nums1 = {1,12,-5,-6,50,3};
        System.out.println("Maximum Average SubArray I -> " + findMaxAverage(nums1,4));

        String string = "pwwkew";
        System.out.println("Longest Substring without repeating character -> " + lengthOfLongestSubstring(string));


    }

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int j = 0;
        int max_freq = 0;
        int maxWindowSize = 0;

        for(int i=0; i<s.length(); i++){

            freq[s.charAt(i) - 'A']++;

            max_freq = Math.max(max_freq, freq[s.charAt(i)-'A']);

            int windowLength = i-j+1;

            if(windowLength - max_freq > k){
                freq[s.charAt(j)-'A']--;
                j++;
            }

            windowLength = i-j+1;
            maxWindowSize = Math.max(windowLength, maxWindowSize);

        }

        return maxWindowSize;

    }


    // (209) - Minimum Size SubArray Sum
    // https://leetcode.com/problems/minimum-size-subarray-sum/description/
    public static int minSubArrayLen(int target, int[] nums){

        int currentWindowSize = 0;
        int minWindowSize = 0;
        int sum = 0;
        int right = 0;
        int left = 0;

        while(right < nums.length){

            sum = sum + nums[right];
            right++;

            while(sum >= target){

                currentWindowSize = right-left;
                minWindowSize = Math.min(currentWindowSize, minWindowSize);

                sum = sum - nums[left];
                left++;

            }

        }

        return minWindowSize == Integer.MAX_VALUE ? 0 : minWindowSize;

    }


    // (643) - Maximum Average SubArray I
    //https://leetcode.com/problems/maximum-average-subarray-i/
    public static double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for(int i=0; i<k; i++){
            sum = sum + nums[i];
        }

        // sliding window -
        int startIndex = 0;
        int endIndex = k-1;
        int max_sum = sum;

        while(endIndex < nums.length-1){

            endIndex++;
            sum = sum + nums[endIndex] - nums[startIndex];
            startIndex++;

            max_sum = Math.max(sum, max_sum);

        }

        return (double) max_sum/k;

    }


    // (3) - Longest Substring without repeating character
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static int lengthOfLongestSubstring(String s){

        if(s.isEmpty()){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        int rightPointer=0;
        int leftPointer=0;
        int maxWindowSize=Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();

        while(rightPointer < s.length()){

            char ch = s.charAt(rightPointer);

            if(!set.contains(ch)){
                set.add(ch);
                maxWindowSize = Math.max(maxWindowSize, rightPointer-leftPointer+1);
                rightPointer++;
            }
            else{
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }

        }

        return maxWindowSize;

    }

}
