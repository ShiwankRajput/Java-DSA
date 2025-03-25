package Recursion.Level1;

public class sumOfNumberFrom_1_to_n {

    public static void main(String[] args) {

        int num = 3;

        System.out.println(sumNumber(num));
    }

    static int sumNumber(int n){

        if(n==1){
            return 1;
        }

        return sumNumber(n-1) + n;
    }
}
