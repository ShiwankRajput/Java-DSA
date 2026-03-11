package Arrays.Searching.BinarySearch.questions;

public class SingleNonDuplicateElement {

    public static void main(String[] args) {

        int[] nums = {3,3,7,7,10,11,11};

        // TC = O(n), SC = O(1)
        System.out.println("Single Element in the sorted array -> " + singleNonDuplicateLS(nums));

        // TC = O(log n), SC = O(1)
        System.out.println("Single Element in the sorted array -> " + singleNonDuplicateBS(nums));

    }

    public static int singleNonDuplicateLS(int[] nums) {

        int i=1;
        int size=nums.length;

        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[size-1]!=nums[size-2]){
            return nums[size-1];
        }

        while(i<=size-2){
            if((nums[i]!=nums[i-1]) && (nums[i]!=nums[i+1])){
                return nums[i];
            }
            else{
                i++;
            }
        }

        return -1; //if not found

    }

    public static int singleNonDuplicateBS(int[] nums) {

        int size=nums.length;
        int start=1;
        int end=size-2;

        if(size==1){
            return nums[0];
        }

        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[size-1]!=nums[size-2]){
            return nums[size-1];
        }

        while(start<=end){

            int mid = start + (end-start)/2;

            if((nums[mid]!=nums[mid-1]) && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2 == 0){ //even
                if(nums[mid]==nums[mid-1]){ // (odd, even)
                    end = mid-1;
                }
                else{ // (even,odd)
                    start = mid+1;
                }
            }
            else{ // odd
                if(nums[mid]==nums[mid-1]){ //(even,odd)
                    start = mid+1;
                }
                else{ //(odd,even)
                    end = mid-1;
                }
            }
        }

        return -1;

    }

}
