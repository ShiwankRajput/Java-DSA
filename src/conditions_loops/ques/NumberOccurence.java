package conditions_loops.ques;

import java.util.Scanner;

public class NumberOccurence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number => ");
        int num = input.nextInt();
        System.out.print("Enter digit to find the number of occurence =>");
        int digit = input.nextInt();

        int count = 0;

        while(num!=0){
            int rem = num%10;
            if(rem == digit){
                count ++;
            }
            num /= 10;
        }

        System.out.println(digit + " is present " + count + " times");
    }
}
