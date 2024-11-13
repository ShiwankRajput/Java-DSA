package Recursion;

public class Count_zeroes {

    public static void main(String[] args) {

        int num = 2030320035;

        System.out.println("Number of zeroes in a given number => " + helper(num));
    }

    static int helper(int n){
        int count = 0;
        return number_of_zeroes(n,count);
    }

    static int number_of_zeroes(int n, int count){

        if(n==0){
            return count;
        }

        int rem = n%10;
        if(rem == 0){
            return number_of_zeroes(n/10,count+1);
        }

        return number_of_zeroes(n/10, count);

    }


}
