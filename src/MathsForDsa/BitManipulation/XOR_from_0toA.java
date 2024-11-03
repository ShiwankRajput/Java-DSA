package MathsForDsa.BitManipulation;

public class XOR_from_0toA {

    public static void main(String[] args) {

        int num = 11;

        XOR(num);
    }

    static void XOR(int n){

        if(n%4==0){
            System.out.println(n);
        }
        else if(n%4 == 1){
            System.out.println("1");
        }
        else if(n%4 == 2){
            System.out.println(n+1);
        }
        else{
            System.out.println("0");
        }

    }
}
