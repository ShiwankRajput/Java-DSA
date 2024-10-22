//https://leetcode.com/problems/two-sum/description/

package Arrays.basics;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2,5,5,11};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    static int[] twoSum(int[] arr, int target){
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if(target == arr[i]+arr[j]){
                    return new int[] {i,j};
                }
            }
        }

        return new int[] {-1,-1};
    }
}
