package Recursion;

public class RecursiveBinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,4,7,19,45,54,78,89};
        int target = 78;

        System.out.println(recursiveBS(arr,target,0,arr.length-1));
    }

    static int recursiveBS(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if(target>arr[mid]){
            return recursiveBS(arr,target,mid+1,e);
        }

        return recursiveBS(arr,target,s,mid-1);
    }
}
