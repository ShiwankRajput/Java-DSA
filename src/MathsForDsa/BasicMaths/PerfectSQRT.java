package MathsForDsa.BasicMaths;

public class PerfectSQRT {

    public static void main(String[] args) {

        int num = 49;

        System.out.println("Perfect square root of a value => " + PerfectSqrt_binarySearch(num));
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
}
