//smallest number greater than the target

package Arrays.Searching.BinarySearch.questions;

public class Smallest_Number {

    public static void main(String[] args) {

        char[] arr = {'c','f','j'};
        char target = 'j';

        System.out.println("Character is present at -> " + smallest_character(arr,target));
    }

    static int smallest_character(char[] arr,char target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>=arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
        }

        return start%arr.length;
    }
}
