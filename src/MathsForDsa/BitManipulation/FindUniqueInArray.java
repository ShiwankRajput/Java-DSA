package MathsForDsa.BitManipulation;

public class FindUniqueInArray {

    public static void main(String[] args) {

        int[] arr = {2,3,4,1,2,1,3,6,4};

        System.out.println(findUnique(arr));
    }

    static int findUnique(int[] arr){

        int ans = 0;

        for(int i=0; i<arr.length; i++){

            ans = ans ^ arr[i];

        }

        return ans;

    }
}
