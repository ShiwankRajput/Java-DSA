package Recursion;

public class Palindrome {

    public static void main(String[] args) {

        int num = 121;

        reverseNumber(num);

        if(rev == num){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Not a palindrome number");
        }
    }

    static int rev = 0;

    static void reverseNumber(int n){

        if(n==0){
            return;
        }

        int rem = n%10;
        rev = rev*10 + rem;

        reverseNumber(n/10);
    }
}
