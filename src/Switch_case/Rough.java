package Switch_case;

public class Rough {

    public static void main(String[] args) {

        int[] arr = {-1,0,3,5,9,12};
        int target = 2;

        System.out.printf("Element is at index ---< " + Binary_search(arr,target));
    }

    public static int Binary_search(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }
}
