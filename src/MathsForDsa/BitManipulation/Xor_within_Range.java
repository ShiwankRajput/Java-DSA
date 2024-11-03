package MathsForDsa.BitManipulation;

public class Xor_within_Range {

    public static void main(String[] args) {

        //range
        int a = 9;
        int b = 50;

        System.out.println("XOR within range is => " + Xor_ans(a,b));

    }

    static int Xor_ans(int num1, int num2){

        int ans =  XOR(num2) ^ XOR(num1-1);

        return ans;
    }

    //Xor from 0 to b (and) 0 to a-1
    static int XOR(int n){

        if(n%4==0){
            return (n);
        }
        else if(n%4 == 1){
            return 1;
        }
        else if(n%4 == 2){
            return (n+1);
        }

        return 0;

    }
}
