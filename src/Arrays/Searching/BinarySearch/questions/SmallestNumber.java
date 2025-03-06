package Arrays.Searching.BinarySearch.questions;

public class SmallestNumber {

    public static void main(String[] args) {

        char[] arr = {'c','f','j'};
        char target = 'f';

        System.out.println(findSmallest(arr,target));

    }

    static char findSmallest(char[] arr, char target){

        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start + (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        if(start == arr.length){
            return arr[0];
        }

        return arr[start];
    }
}
