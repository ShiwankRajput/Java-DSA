package conditions_loops.ques;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ChecksAlphabet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);

        if(c>=97 && c<=122){
            System.out.println("loweCase");
        }
        else if(c>=65 && c<=90){
            System.out.println("UpperCase");
        }
        else if(c>=48 && c<=57){
            System.out.println("digit");
        }
        else{
            System.out.println("symbol");
        }

    }
}
