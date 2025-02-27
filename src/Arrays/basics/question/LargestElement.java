package Arrays.basics.question;

/*

 Given an array arr[]. The task is to find the largest element and return it.

*/

public class LargestElement {

    public static void main(String[] args) {

        int[] arr = {1,8,7,56,90};
        int largest = Integer.MIN_VALUE;

        System.out.println(find(arr,largest));

    }

    static int find(int[] arr, int largest){

        if(arr.length == 1){
            return arr[0];
        }

        for(int a : arr){
            if(a>largest){
                largest = a;
            }
        }

        return largest;
    }
}
