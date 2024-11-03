package MathsForDsa.BitManipulation;

import java.sql.Array;
import java.util.Arrays;

public class flippingImage {

    public static void main(String[] args) {

        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};

        System.out.println(Arrays.toString(reverse_and_flip_BitsOf2DArray(arr)));

    }

    static int[][] reverse_and_flip_BitsOf2DArray(int[][] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                int temp = arr[i][j];
                arr[i][j] = arr[i][(arr[i].length)-1];
                arr[i][(arr[i].length)-1] = temp;

            }
        }

        return arr;
    }
}
