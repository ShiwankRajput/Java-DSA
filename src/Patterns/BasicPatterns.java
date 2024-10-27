package Patterns;

/*

How to approach --->

1) no of lines = no of rows = no of times the outer loop
   will run.

2) Identify for every row no.,
   - how many col are there.
   - type of element in col.

3) What do you need to Print.


*/


public class BasicPatterns {

    public static void main(String[] args) {

        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(9);
        pattern6(9);

    }

    static void pattern6(int n){
        int w = 2;

        for(int i=1; i<=n; i++){
            if(i<=(n/2)+1){
                for(int k=4; k>i-1; k--){
                    System.out.print(" ");
                }

                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            else{
                for(int k=1; k<=(i-5); k++){
                    System.out.print(" ");
                }

                for(int j=1; j<=(i-w); j++){
                    System.out.print("* ");
                }
                w += 2;
                System.out.println();
            }
        }

        System.out.println();
    }

    static void pattern5(int n){
        int k = 2;

        for(int i=1; i<=n; i++){
            if(i<=(n/2)+1){
                for(int j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            else{
                for(int j=1; j<=(i-k); j++){
                    System.out.print("* ");
                }
                k += 2;
                System.out.println();
            }
        }

        System.out.println();
    }

    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=5; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();
    }

    static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
