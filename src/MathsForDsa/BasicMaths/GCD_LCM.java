package MathsForDsa.BasicMaths;

public class GCD_LCM {

    public static void main(String[] args) {

        int a = 2;
        int b = 7;

        System.out.println("GCD of a and b => " + gcd_of_number(a,b));
        System.out.println("LCM of a and b => " + lcm_of_number(a,b));
    }

    static int gcd_of_number(int a,int b){

        if(a==0){
            return b;
        }

        return gcd_of_number(b%a,a);
    }

    static int lcm_of_number(int a,int b){

        return a*b / gcd_of_number(a,b);
    }
}
