package String_StringBuilders.questions;

import java.util.Arrays;

public class ReverseNum_InString {

    public static void main(String[] args) {

        String s = "the sky is blue";

        System.out.println(reverse(s));
    }

    static String reverse(String s){

        String b = s.replaceAll("\\s+"," ");
        String[] arr = b.trim().split(" ");

        int i=0;
        int j=arr.length-1;
        while(i<j){

            swap(arr,i,j);
            i++;
            j--;
        }
        String result = String.join(" ",arr);

        return result;
    }

    static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
