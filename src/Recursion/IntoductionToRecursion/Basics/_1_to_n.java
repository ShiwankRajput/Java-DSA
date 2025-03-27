package Recursion.IntoductionToRecursion.Basics;

public class _1_to_n {

    public static void main(String[] args) {

        printNumbers(5);

    }

    static void printNumbers(int n){
        if(n==0){
            return;
        }

        printNumbers(n-1);
        System.out.println(n);
    }
}
