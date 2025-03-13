package Arrays.Searching.BinarySearch.questions;

public class RotationCount_RotatedSorted {

    public static void main(String[] args) {

    int[] nums = {5, 1, 2, 3, 4};

    System.out.println("Rotation Count -> " + findRotationCount(nums));

    }

    static int findRotationCount(int[] nums){

        int pivotIndex = findPivot(nums);

        return pivotIndex+1;
    }

    static int findPivot(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            else if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[start] >= nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1; //if pivot is not found, array is not rotated but it is sorted.
    }
}
