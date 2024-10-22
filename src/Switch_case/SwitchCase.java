package Switch_case;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        /* equals check the value but not the reference of the value, whereas == checks the
        reference of the value too */

        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wednesday");
                break;

            default:
                System.out.println("wrong input");
        }


        //enhanced switch statement, using arrow operator.....
        switch (day) {
            case 1 -> {
                System.out.println("Monday");
            }
            case 2,3,4,5-> {
                System.out.println("tuesday");
            }
            case 6,7,8 -> {
                System.out.println("wednesday");
            }
            default -> {
                System.out.println("wrong input");
            }
        }


    }
}
