package Arrays.basics.question;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {10, 5, 10};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println(find(arr,largest,secondLargest));

    }

    static int find(int[] arr, int largest,int secondLargest){

        for(int a : arr){
            if(a>largest){
                largest = a;
            }
        }

        for(int a : arr){
            if(a == largest){
                continue;
            }
            if(a > secondLargest){
                secondLargest = a;
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }

        return secondLargest;
    }

}
