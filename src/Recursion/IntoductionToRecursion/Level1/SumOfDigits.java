package Recursion.IntoductionToRecursion.Level1;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 531;
        System.out.println("Sum of digits -< " + calculateSum(num));

    }

    static int calculateSum(int n){

        if(n==0){
            return 0;
        }

        int rem = n%10;

        return calculateSum(n/10) + rem;
    }
}
