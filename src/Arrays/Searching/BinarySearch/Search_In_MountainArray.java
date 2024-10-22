package Arrays.Searching.BinarySearch;

public class Search_In_MountainArray {

    public static void main(String[] args) {

        int[] arr = {1,2,4,6,3,2};
        int target = 2;

        System.out.println("Peak element is present at index -> " +peakElement(arr));
        System.out.println("index of target in increasing array -> " +binarySearch1(arr,target,peakElement(arr)));
        System.out.println("index of target in decreasing array -> " +binarySearch2(arr,target,peakElement(arr)));
    }

    //for increasing array...
    public static int binarySearch1(int arr[], int target, int end){
        int s = 0;
        int e = end;

        while(s<=e){

            int mid = s+(e-s)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }

        return -1;
    }

    //for decreasing array...
    public static int binarySearch2(int arr[], int target, int end){
        int s = end+1;
        int e = arr.length-1;

        while(s<=e){

            int mid = s+(e-s)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }

        return -1;
    }

    public static int peakElement(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){

            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }

        return end;
    }
}
