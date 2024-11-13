package Recursion;

// given a integer num, return the number of steps to reduce it to zero. In one step, if number is even you have
// to divide by 2 otherwise subtract by 1.

public class Number_reduction_steps {

    public static void main(String[] args) {

        int num = 10;

        System.out.println("Number to steps to reduce a number to zero => " +helper(num));
    }

    static int helper(int n){
        int steps = 0;
        return steps_to_zero(n,steps);
    }

    static int steps_to_zero(int n,int steps){

        if(n==0){
            return steps;
        }

        if(n%2==0){
            return steps_to_zero(n/2,steps+1);
        }

        return steps_to_zero(n-1,steps+1);
    }
}
