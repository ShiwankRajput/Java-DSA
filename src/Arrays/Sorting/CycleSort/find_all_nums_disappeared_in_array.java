package Arrays.Sorting.CycleSort;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the
// integers in the range [1, n] that do not appear in nums.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_all_nums_disappeared_in_array {

    public static void main(String[] args) {

        int[] arr = {3,2,1,4,2,3,7,6,8};

        System.out.println(findNums(arr));

    }

    public static List<Integer> findNums(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                list.add(j+1);
            }
        }

        return list;
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
