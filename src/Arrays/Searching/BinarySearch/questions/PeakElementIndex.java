package Arrays.Searching.BinarySearch.questions;

public class PeakElementIndex {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1};

        System.out.println(peakIndex(arr));

    }

    static int peakIndex(int[] nums){

        int start = 0;
        int end = nums.length-1;

        while(start<end){

            int mid = start + (end-start)/2;

            if(nums[mid]>nums[mid+1]){  //you are in decreasing array.
                end = mid;
            }
            else if(nums[mid]<nums[mid+1]){   //you are in increasing array.
                start = mid+1;
            }
        }

        return nums[start];

    }
}
