package Arrays.Searching.LinearSearching;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {34,67,26,93,15,35,24,29};
        int target = 93;
        System.out.println(search(arr,target));

    }

    static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
