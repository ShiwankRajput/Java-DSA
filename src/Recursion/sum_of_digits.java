package Recursion;

public class sum_of_digits {

    public static void main(String[] args) {

        int num = 1;

        System.out.println("Sum of digits => " + digit_sum(num));
    }

    static int digit_sum(int n){

        if(n==0){
            return 0;
        }

        int rem = n%10;
        n = n/10;

        return digit_sum(n) + rem;
    }
}
