package Recursion;

import java.util.ArrayList;

public class LinearSearchRecursion {

    public static void main(String[] args) {

        int[] arr = {5,7,1,3,15,15,9};
        int target = 15;

        //if array consist of single occurence of element.
        System.out.println("Target element is present at => " + linearSearch(arr,target,0));


        //if array consist of many occurences of the element.
        linearSearchAllIndex(arr,target,0);
        System.out.println("Target element is present at => " + list);
    }

    static int linearSearch(int[] arr, int target,int i){

        if(arr[i] == target){
            return i;   //element found
        }
        else if((i == arr.length-1) && (arr[i]!=target)){
            return -1;  //element not found
        }

        return linearSearch(arr,target,i+1);
    }



    static ArrayList<Integer> list = new ArrayList<>();

    static void linearSearchAllIndex(int[] arr, int target,int i){

        if(arr[i] == target){
            list.add(i);   //element found
        }
        else if((i == arr.length-1) && (arr[i]!=target)){
            return;  //element not found
        }

        linearSearchAllIndex(arr,target,i+1);
    }
}
