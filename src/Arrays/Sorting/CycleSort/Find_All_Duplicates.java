package Arrays.Sorting.CycleSort;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import javax.swing.plaf.SplitPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Duplicates {

    public static void main(String[] args) {

        int[] arr = {1};

        System.out.println(all_Duplicates(arr));
    }

    public static List<Integer> all_Duplicates(int[] arr){

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

        //finding duplicate elements
        List<Integer> list = new ArrayList<>();

        for(int j=0; j< arr.length; j++){
            if(arr[j] != j+1){
                list.add(arr[j]);
            }
        }

        return list;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
