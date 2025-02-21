package Arrays.basics.question;

public class FindUnique {

    public static void main(String[] args) {

        int[] arr = {7, 3, 2, 2, 5, 3, 7};

        System.out.println(unique(arr));
    }

    static int unique(int[] arr) {

        int unq = 0;
        for (int val : arr) {
            unq = unq ^ val;
        }

        return unq;
    }
}