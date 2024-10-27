package Recursion;

public class fibonacci_series {

    public static void main(String[] args) {

        System.out.println(fibonaaci(6));

    }

    static int fibonaaci(int n){

        if(n==0 || n==1){
            return n;
        }

        return fibonaaci(n-1)+fibonaaci(n-2);
    }
}
