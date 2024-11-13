package Recursion;

public class _1_to_n {

    public static void main(String[] args) {

        int num = 5;

        printNumbers(num);
    }

    static void printNumbers(int n){
        if(n==0){
            return;
        }

//        System.out.println(n);
        printNumbers(n-1);
        System.out.println(n);
    }
}
