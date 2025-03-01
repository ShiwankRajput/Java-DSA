package Arrays.basics.question;

public class Missing_number {

    public static void main(String[] args) {

        int[] nums = {3,0,1};

        System.out.println(missing(nums));
        System.out.println(missingOptimisation(nums));
    }

    static int missing(int[] nums){

        int n = nums.length;

        for(int i=0; i<=n; i++){

            boolean found = false;

            for(int j=0; j<n; j++){
                if(i == nums[j]){
                    found = true;
                    break;
                }
            }

            //if element is not found
            if(found == false){
                return i;
            }
        }

        return -1; //this won't not be reached

    }

    static int missingOptimisation(int[] nums){

        int i=0;

        while(i<nums.length){
            if(nums[i]!=i && nums[i]<nums.length){
                int j = nums[i];
                swap(nums,i,j);
            }
            else{
                i++;
            }
        }

        for(int k=0; k<nums.length; k++){
            if(nums[k]!=k){
                return k;
            }
        }

        return nums.length;
    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
