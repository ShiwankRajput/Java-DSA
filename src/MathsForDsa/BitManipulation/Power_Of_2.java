package MathsForDsa.BitManipulation;

public class Power_Of_2 {

    public static void main(String[] args) {

        int num = 16;

        //brute force
        if(finding_2_Power1(num) == 1){
            System.out.println("Number is power of 2");
        }
        else{
            System.out.println("Number is not power of 2");
        }

        //more optimised
        finding_2_power2(num);

    }

    //brute force solution
    static int finding_2_Power1(int n){

        int count = 0;
        while(n>0){
            if((n&1)==1){
                count++;
            }

            n = n>>1;
        }

        return count;
    }

    //optimised solution
    static void finding_2_power2(int n){

        n = n&(n-1);

        if(n==0){
            System.out.println("Number is power of 2");
        }
        else{
            System.out.println("Number is not power of 2");
        }

    }
}
