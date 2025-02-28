package Arrays.basics.question;

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[8];
        System.out.println("Enter the elements of array => ");
        for (int i=0; i<arr1.length; i++){
            arr1[i] = input.nextInt();
        }

        System.out.println("maximum value > " + max(arr1));
    }

    static int max(int[] arr1){
        int max = arr1[0];
        for (int e : arr1){
            if(max < e){
                max = e;
            }
        }

        return max;
    }
}
