package Recursion;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,10,11,13,14};
        int target = 2;

        System.out.println("Element is present at => " + binarySearch(arr,target,0,arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int s, int e){

        if(s>e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[s]<=arr[mid]){
            if(target>arr[s] && target<arr[mid]){
                return binarySearch(arr,target,s,mid-1);
            }
        }

        if(target>=arr[mid] && target<=arr[e]){
            return binarySearch(arr,target,mid+1,e);
        }

        return binarySearch(arr,target,s,mid-1);
    }
}
