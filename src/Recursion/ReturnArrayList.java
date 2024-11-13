package Recursion;

import java.util.ArrayList;

public class ReturnArrayList {

    public static void main(String[] args) {

        int[] arr ={3,9,8,4,5,6,4,4,9,2,9,3,9};
        int target = 9;
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Target element is present at => " + returningList1(arr,target,0,list));
        System.out.println("Target element is present at => " + returningList2(arr,target,0));
    }

    //if arrayList is pass as an argument
    static ArrayList<Integer> returningList1(int[] arr, int target, int i, ArrayList<Integer> list){

        if(i > arr.length-1){
            return list;
        }
        else if(arr[i] == target){
            list.add(i);
        }

        return returningList1(arr,target,i+1,list);
    }


    //if arrayList is not passed as an argument
    static ArrayList<Integer> returningList2(int[] arr, int target, int i){

        ArrayList<Integer> list = new ArrayList<>();

        if(i>arr.length-1){
            return list;
        }
        else if(arr[i] == target){  // this will contain answer for that function only
            list.add(i);
        }

        ArrayList<Integer> a = returningList2(arr,target,i+1);

        list.addAll(a);

        return list;
    }
}
