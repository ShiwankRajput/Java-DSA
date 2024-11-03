package MathsForDsa.BitManipulation;

public class MagicNumber {

    public static void main(String[] args) {

        int n = 6;
        System.out.println(magicalNumber(n));
    }

    static int magicalNumber(int n){

        int i=1;
        int number = 0;

        while(n>0){
            int rem = n & 1;
            number = (int) (number + (rem * Math.pow(5, i)));
            n = n >> 1;
            i = i + 1;
        }

        return number;
    }
}
