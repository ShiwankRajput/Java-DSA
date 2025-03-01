package Arrays.Searching.LinearSearching.question;

public class FindNum_withEvenDigits {

    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        System.out.println(search(nums));
    }

    static int search(int[] nums){

        int count = 0;

        for(int a:nums){
            String num = String.valueOf(a);
            if(num.length()%2 == 0){
                count++;
            }
        }

        return count;
    }


}
