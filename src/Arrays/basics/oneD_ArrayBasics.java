/*  Syntax =>
    datatype[] <array_name> = new datatype[size];  */


package Arrays.basics;

import java.util.Arrays;
import java.util.Scanner;

public class oneD_ArrayBasics {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //creating object for primitives...
        int[] arr1 = new int[5];
        for (int i=0; i<arr1.length; i++){
            arr1[i] = input.nextInt();
        }

        for(int n : arr1){
            System.out.print(n + " ");
        }
        //OR
        System.out.println(Arrays.toString(arr1));


        //creating array for objects..
        String[] arr2 = new String[4];
        for (int i=0; i<arr2.length; i++){
            arr2[i] = input.next();
        }

        System.out.println(Arrays.toString(arr2));
    }
}
