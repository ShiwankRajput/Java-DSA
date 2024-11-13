package Recursion;

public class Patterns {

    public static void main(String[] args) {

        patter1(5,0);
        helper(4);
    }

    //pattern 2  ----------------->
    static void helper(int n){
        patter2(4,1,0);
    }

    static void patter2(int n,int r, int c){

        if(r == n+1){
            return;
        }

        if(c<r){
            System.out.print("*"+" ");
            patter2(n,r,c+1);
        }
        else{
            System.out.println();
            patter2(n,r+1,0);
        }
    }


    // pattern 1   ------->
    static void patter1(int r, int c){

        if(r == 0){
            return;
        }

        if(c<r){
            System.out.print("*"+" ");
            patter1(r,c+1);
        }
        else{
            System.out.println();
            patter1(r-1,0);
        }
    }
}
