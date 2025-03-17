package MathsForDsa.BasicMaths;

import java.util.ArrayList;

public class Factors_of_number {

    public static void main(String[] args) {

        int num = 20;
        factors1(num);
        factors2(num);
        factors3(num);
    }

    //brute-force solution, TC : O(n)
    static void factors1(int n){

        System.out.println("Factors of number -> ");
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
    }

    //more optimised solution, TC : O(sqrt(n))
    static void factors2(int n){

        System.out.println();
        System.out.println("Factors of number -> ");
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.print(" "+ i + " " + n/i);
            }
        }
    }


    //TC and SC : O(sqrt(n))
    static void factors3(int n){

        System.out.println();
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("Factors of number -> ");
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.print(i+" ");
                l.add(n/i);
            }
        }

        for(int i=l.size()-1; i>=0; i--){
            System.out.print(l.get(i) + " ");
        }
    }
}
