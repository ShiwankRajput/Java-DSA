package Recursion.IntoductionToRecursion.Level1;

public class ProductOfDigits {

    public static void main(String[] args) {

        int num = 531;
        System.out.println("Product of digits -< " + calculateProduct(num));
    }

    static int calculateProduct(int n){

        if(n==0){
            return 1;
        }

        int rem = n%10;

        return calculateProduct(n/10) * rem;

    }
}
