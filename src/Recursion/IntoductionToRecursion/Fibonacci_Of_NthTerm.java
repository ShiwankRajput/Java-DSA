package Recursion.IntoductionToRecursion;

public class Fibonacci_Of_NthTerm {

    public static void main(String[] args) {

        int nthTerm = 4;

        System.out.printf("Fibonacci of %d term -< %d", nthTerm, fibonacci(nthTerm));
    }

    static int fibonacci(int n){

        if(n==0 || n==1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
