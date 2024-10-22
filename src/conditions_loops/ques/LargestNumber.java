package conditions_loops.ques;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a>b && a>c){
            System.out.println(a + " is largest");
        }
        else if (b>c && b>a){
            System.out.println(b + " is largest");
        }
        else{
            System.out.println(c + " is largest");
        }

        //OR

        int max = Math.max( c, Math.max(a,b));
        System.out.println(max);
    }
}
