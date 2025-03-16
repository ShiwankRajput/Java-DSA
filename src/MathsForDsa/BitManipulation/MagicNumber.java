package MathsForDsa.BitManipulation;

public class MagicNumber {

    public static void main(String[] args) {

        int n = 4;

        System.out.println("Magical NUmber of n is -<" + magicNumber(n));
    }

    static int magicNumber(int n){

        int i=1;
        int sum=0;

        while(n>0){
            if((n&1) == 1){
                sum = (int) (sum + Math.pow(5,i));
            }

            i++;
            n = n>>1;
        }

        return sum;
    }
}
