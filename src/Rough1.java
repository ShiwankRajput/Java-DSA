import java.util.Arrays;

public  class Rough1{

    public static void main(String[] args) {

        int[] nums1 ={4,1,2};
        int[] nums2 = {1,3,4,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] nums3 = new int[nums1.length];
        int index = 0;

        for(int i=0; i<nums1.length; i++){

            int j = 0;
            int greatest = Integer.MIN_VALUE;

            while(j < nums2.length){
                if(nums1[i] != nums2[j]){
                    j++;
                }
                else{
                    break;
                }
            }

            for(int k = j; k < nums2.length-1; k++){
                if(nums2[k+1] > greatest && nums2[k+1] > nums1[i]){
                    greatest = nums2[k+1];
                    nums3[index] = nums2[k+1];
                    index++;
                }
            }

            if(index == i){
                nums3[index] = -1;
                index++;
            }

        }

        return nums3;

    }

}

