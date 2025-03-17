package MathsForDsa.BasicMaths;

public class PrimeNumber {

    public static void main(String[] args) {

        for(int i=1; i<=40; i++){
            if(checkPrimeNumber(i) == false){
                System.out.println(i + " not prime");
            }
            else{
                System.out.println(i + " prime");
            }
        }

        //more optimised
        int n=40;
        boolean[] primes = new boolean[n+1];
        sieveOfErastosthenes(primes,n);
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

    static void sieveOfErastosthenes(boolean[] primes, int n){

        if(n<=1){
            System.out.println("Not prime");
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(!primes[i]){
                for(int j=i*i; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
