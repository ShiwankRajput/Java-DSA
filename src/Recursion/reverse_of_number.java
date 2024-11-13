package Recursion;

public class reverse_of_number {

    public static void main(String[] args) {

        int num = 65798;

        numberReverse(num);
        System.out.println(rev);

    }

    static int rev = 0;

    static void numberReverse(int n){

        if(n==0){
            return;
        }

        int rem = n%10;
        rev = rev*10 + rem;
        n = n/10;

        numberReverse(n);
    }
}
