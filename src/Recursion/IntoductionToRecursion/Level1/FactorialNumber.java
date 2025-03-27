package Recursion.IntoductionToRecursion.Level1;

public class FactorialNumber {

    public static void main(String[] args) {

        System.out.println("Factorial of number is -< " + factorial(4));
    }

    static int factorial(int n){

        if(n==0){
            return 1;
        }

        return factorial(n-1) * n;
    }
}
