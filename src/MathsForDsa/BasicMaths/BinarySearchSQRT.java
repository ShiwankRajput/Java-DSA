package MathsForDsa.BasicMaths;

public class BinarySearchSQRT {

    public static void main(String[] args) {

        int num = 40;
        int precision = 3;

        System.out.println("Perfect square root of a value => " + PerfectSqrt_binarySearch(num));
        System.out.println("Square root of number => " + BinarySearchSqrt(num,precision));
    }

    static int PerfectSqrt_binarySearch(int n){

        int s = 0;
        int e = n;

        while(s<=e){
            int m = s + (e-s)/2;

            if(m*m == n){
                return m;
            }
            else if(m*m > n){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }

        return -1;
    }

    //TC: 0(log n)
    static double BinarySearchSqrt(int n, int p){

        int s = 0;
        int e = n;


        while (s<=e){
            int m = s + (e-s)/2;

            if(m*m == n){
                return m;
            }
            else if(m*m>n){
                e = m-1;
            }
            else{
                s = m+1;
            }
        }

        double inc = 0.1;
        double root = e;

        for (int i=0; i<p; i++){
            while (root*root <= n){
                root += inc;
            }

            root -= inc;
            inc = inc/10;
        }

        return root;
    }
}
