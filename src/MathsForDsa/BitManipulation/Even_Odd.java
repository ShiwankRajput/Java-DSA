package MathsForDsa.BitManipulation;

public class Even_Odd {

    public static void main(String[] args) {

        int num = 185488;

        identify(num);

    }

    static void identify(int n){

        if((n & 1) == 1){
            System.out.println("Number is odd");
        }
        else{
            System.out.println("Number is even");
        }
    }
}
