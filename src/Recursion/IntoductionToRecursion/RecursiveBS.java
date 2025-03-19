package Recursion.IntoductionToRecursion;

public class RecursiveBS {

    public static void main(String[] args) {

        int[] arr = {3,5,7,8,10,13,18,25};
        int target = 20;

        System.out.println("Element is found at index -< " + binarySearch(arr,target,0,arr.length-1));

    }

    static int binarySearch(int[] arr,int target,int start, int end){

        if(start>end){
            return -1; //answer not found
        }

        int mid = start + (end-start)/2;

        if(arr[mid] == target){
            return mid;
        }
        else if(target>arr[mid]){
            return binarySearch(arr,target,mid+1,end);
        }

        return binarySearch(arr,target,start,mid-1);

    }
}
