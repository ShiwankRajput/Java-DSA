package Arrays.Searching.BinarySearch.questions;

public class FloorNumber {

    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.printf("Floor of %d is : %d",target,floor(arr,target));

    }

    static int floor(int[] arr,int target){

        if(target<arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length;

        while (start<=end){

            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }

        return arr[end];
    }
}
