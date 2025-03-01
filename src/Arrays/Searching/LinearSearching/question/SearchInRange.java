package Arrays.Searching.LinearSearching.question;

public class SearchInRange {

    public static void main(String[] args) {

        int[] arr = {18,12,-7,3,14,28};
        int start = 1;
        int end = 4;
        int target = 3;

        System.out.println("present at :- " +searching(arr,start,end,target));
    }

    static int searching(int[] arr, int start, int end, int target){

        for (int i=start; i<=end; i++){
            if (arr[i] == target){
                return i;
            }
        }

        return -1;

    }
}
