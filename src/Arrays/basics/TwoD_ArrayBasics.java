package Arrays.basics;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_ArrayBasics {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] arr2 = {
                {1,2,3},
                {4,5,},
                {6,7,8,9}
        };

        int[][] arr1 = new int[3][3];   //it is mandatory to provide rows but columns can be optional
        System.out.println(arr1.length);  //gives number of rows

        for (int row=0 ;row<arr1.length; row++){
            for (int col=0; col<arr1[row].length; col++) {
                arr1[row][col] = input.nextInt();
            }
        }

        //printing array.....

        //simply
        for (int row=0 ;row<arr1.length; row++){

            for (int col=0; col<arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }

            System.out.println();
        }
        //OR (using toString())
        for (int row=0 ; row<arr1.length ;row++){
            System.out.println(Arrays.toString(arr1[row]));
        }
        //enhanced way of printing
        for(int[] a: arr1){
            System.out.println(Arrays.toString(a));
        }

    }
}
