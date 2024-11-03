package MathsForDsa.BitManipulation;

public class setBits_in_num {

    public static void main(String[] args) {

        int num = 458;

        System.out.println(Integer.toBinaryString(num));
        System.out.println("Number of bits => " + setBits(num));
    }

    static int setBits(int n){

        int count = 0;

        while(n>0){
            if((n&1) == 1){
                count++;
            }

            n = n>>1;
        }

        return count;
    }
}
