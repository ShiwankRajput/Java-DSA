public class Rough{

    public static void main(String[] args) {

        int[] nums = {5,-3,5};

//        System.out.println("Maximum Subarray Sum Circular -> " + maxSubArraySumCircular(nums));

        System.out.println(firstUniqChar("aabb"));

    }

    public static int firstUniqChar(String s) {

        boolean found;

        for(int i=0; i<s.length(); i++){
            found = true;

            for(int j=0; j<s.length(); j++){

                if(i!=j && s.charAt(i) == s.charAt(j)){
                    found = false;
                    break;
                }

            }

            if(found == true){
                return i;
            }
        }

        return -1;

    }

    // Optimal :- TC - O(n), SC - O(1)
    public static int maxSubArraySumCircular1(){



        return 0;

    }

    // Brute Force :- TC - O(n), SC - O(1)
    public static int maxSubArraySumCircular(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0; i<n; i++){
            int sum = 0;
            int j=i;
            for(int k=0; k<n; k++){
                int roundIndex = j%n;
                if(roundIndex != i-1){
                    sum = sum + nums[roundIndex];
                    maxSum = Math.max(sum, maxSum);
                    j++;
                }
            }
        }

        return maxSum;

    }

}
