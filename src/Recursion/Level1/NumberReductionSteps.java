package Recursion.Level1;

public class NumberReductionSteps {

    public static void main(String[] args) {

        int num = 14;
        System.out.println("Number of steps to reduce number to zero -< " + count(num));
    }

    static int count(int num){

        return helper(num,0);
    }

    static int helper(int num, int count){

        if(num==0){
            return count;
        }

        if(num%2==0){
            return helper(num/2,count+1);
        }

        return helper(num-1,count+1);
    }
}
