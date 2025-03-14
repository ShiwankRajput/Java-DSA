package Arrays.Sorting.CycleSort.questions;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;

public class NumberDisappearedInArray {

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findNumber(arr));
    }

    static ArrayList<Integer> findNumber(int[] nums){

        ArrayList<Integer> list = new ArrayList<>();

        // cyclic sort of duplicates element
        int i = 0;
        while(i<nums.length){

            if((nums[i] != i+1) && (nums[i] != nums[nums[i]-1])){
                swap(nums,i,nums[i]-1);
            }
            else{
                i++;
            }
        }

        // finding numbers
        for (int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }

        return list;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
