package Recursion.IntoductionToRecursion.Level1;

public class NumberReverse {

    public static void main(String[] args) {

        int num = 531;
        System.out.println("Reverse of number is -< " + reverse(num));

    }

    static int reverse(int n){

        if(n==0){
            return 0;
        }

        int rem = n%10;

        return reverse(n/10)*10 + rem;
    }
}
