package Recursion;

public class product_of_digits {

    public static void main(String[] args) {

        int num = 505;

        System.out.println("Products of Digits => " + digits_product(num));
    }

    static int digits_product(int n){

        if(n%10==n){
            return n;
        }

        int rem = n%10;
        n = n/10;

        return digits_product(n)*rem;
    }
}
