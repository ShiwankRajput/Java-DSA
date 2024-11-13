package Recursion;

public class factorial_of_number {

    public static void main(String[] args) {

        int num = 6;

        System.out.println(factorial(num));
    }

    static int factorial(int num){

        if(num == 0){
            return 1;
        }
        else if(num<0){
            return -1;
        }

        return ( factorial(num-1) * num );
    }
}
