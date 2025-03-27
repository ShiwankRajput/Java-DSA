package Recursion.IntoductionToRecursion.Level2_ArrayQuestions;

import java.util.ArrayList;

public class RecursiveLS {

    public static void main(String[] args) {

        int[] arr = {1,5,2,12,9,9,10};
        int target = 9;

        System.out.println("target element is present at ? -< " + findTarget(arr,target,0));
//        System.out.println("Duplicate target is present by fun1? " + findAllIndex(arr,target,0));
        System.out.println("Duplicate target is present at by fun2? " + findAllIndex1(arr,target,0,new ArrayList<>()));
        System.out.println("Duplicate target is present at by fun3? " + findAllIndex2(arr,target,0));

    }


    static int findTarget(int[] arr, int target, int i){

        if(i == arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }

        return findTarget(arr,target, i+1);
    }


    //ArrayList outside function body
    static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int i){

        if(i==arr.length){
            return list;
        }

        if(arr[i]==target){
            list.add(i);
        }

        return findAllIndex(arr,target,i+1);

    }


    //ArrayList with function body as an argument
    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int i, ArrayList<Integer> list1){

        if(i == arr.length){
            return list1;
        }
        else if(arr[i] == target){
            list1.add(i);
        }

        return findAllIndex1(arr,target,i+1,list1);
    }


    //ArrayList within function body
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int i){

        ArrayList<Integer> list2 = new ArrayList<>();

        if(i == arr.length){
            return list2;
        }
        else if(arr[i] == target){
            list2.add(i);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,i+1);
        list2.addAll(ansFromBelowCalls);

        return list2;

    }
}
