package MathsForDsa.BasicMaths;

public class PrimeNumber {

    public static void main(String[] args) {

        for(int i=1; i<=40; i++){
            if(checkPrimeNumber(i) == false){
                System.out.println(i + "not prime");
            }
            else{
                System.out.println(i + "prime");
            }
        }
    }

    static Boolean checkPrimeNumber(int n){

        if(n<=1){
            return false;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;

    }
}
