//swapping elements with their indexes..
//maximum in the array....
//reverse of an array....

package Arrays.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ques1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[6];
        System.out.println("Enter elements of array > ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter 1st index to swap > ");
        int a = input.nextInt();
        System.out.print("Enter 2nd element to swap > ");
        int b = input.nextInt();

        System.out.println(Arrays.toString(swap(arr, a, b)));
        System.out.println("maximum value > " + max(arr));
        System.out.println("reverse array => " + Arrays.toString(reverse(arr)));
        System.out.println("function reverse array => " + Arrays.toString(FunctionReverse(arr)));
    }

    static int[] swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int e : arr) {
            if (max < e) {
                max = e;
            }
        }
        return max;
    }

    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }

    static int[] FunctionReverse(int[] arr){
        int start = 0;
        int end = 5;

        while(start < end){
            swap(arr,start,end);

            start++;
            end--;
        }

        return arr;
    }
}
