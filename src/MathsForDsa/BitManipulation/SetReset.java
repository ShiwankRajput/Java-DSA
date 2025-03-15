package MathsForDsa.BitManipulation;

public class SetReset {

    public static void main(String[] args) {

        int num = 313;
        System.out.println(Integer.toBinaryString(num));

        set(num,7);
        reset(num,5);
    }

    static void set(int num, int position){

        int mask = 1 << (position-1);
        int newNum = num | mask;

        System.out.println("set of bit in number -< " + Integer.toBinaryString(newNum));
    }

    static void reset(int num, int position){

        int mask = ~ (1 << (position-1));
        int newNum = num & mask;

        System.out.println("reset of bit in number -< " + Integer.toBinaryString(newNum));

    }
}
