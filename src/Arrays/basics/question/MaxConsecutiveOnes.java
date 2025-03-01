package Arrays.basics.question;

import java.util.ArrayList;
import java.util.Collections;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {

        int[] nums = {0,0,0,0,0,0};

        System.out.println(consecutive(nums));
        System.out.println(maxOptimisation(nums));
    }

    static int consecutive(int[] nums){

        int count=0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int a : nums){
            if(a==1){
                count++;
            }
            else{
                list.add(count);
                count=0;
            }
        }

        if(count!=0){
            list.add(count);
        }


        //finding maximum
        return Collections.max(list);

    }

    static int maxOptimisation(int[] nums){

        int count = 0;
        int max = 0;

        for(int a : nums){
            if(a == 1){
                count++;
                max = count;
            }
            else{
                count = 0;
            }
        }

        return max;
    }
}
