package MathsForDsa.BitManipulation;

public class NumOfDigitsInBaseB {

    public static void main(String[] args) {

        int num = 6;
        int base = 2;

        int digits = (int) (Math.log(num) / Math.log(base)) + 1;
        System.out.println("Number of digits --> " + digits);
    }
}
