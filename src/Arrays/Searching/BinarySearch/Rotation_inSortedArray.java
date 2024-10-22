package Arrays.Searching.BinarySearch;

public class Rotation_inSortedArray {

    public static void main(String[] args) {

        int[] arr = {0,1,3,4,5,6,7};

        int pivot = find_pivot(arr);
        System.out.println("Number of rotations -> " + (pivot+1));

    }

    public static int find_pivot(int arr[]){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){  //mid<end is for if pivot is present at last of index
                return mid;
            }
            else if(mid>end && arr[mid]<arr[mid-1]){  //mid>end is for if pivot is present at last of index
                return mid-1;
            }
            else if(arr[start]>arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        return -1;
    }
}
