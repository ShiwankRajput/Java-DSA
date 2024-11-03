package MathsForDsa.BitManipulation;

public class BitMasking {

    public static void main(String[] args) {

        int num = 313;
        int position = 5;

        find_ith_bit(num,position);
        set_ith_bit(num,position);
        reset_ith_bit(num,position);
    }

    static void find_ith_bit(int n,int position){

        int mask = 1<<(position-1);

        if((n & mask)==0){
            System.out.println("bit is 0");
        }
        else{
            System.out.println("bit is 1");
        }
    }

    static void set_ith_bit(int n, int position){

        int mask = 1<<(position-1);
        int newNum = n | mask;

        System.out.println(newNum);
    }

    static void reset_ith_bit(int n,int position){
        int mask = ~(1<<(position-1));
        int newNum = n & mask;

        System.out.println(newNum);
    }
}
