package Arrays.Searching.BinarySearch.questions;

public class KokoEatingBananas {

    public static void main(String[] args) {

        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println("Minimum eating speed of koko -> " + minEatingSpeed(piles, h));

    }

    public static int minEatingSpeed(int[] piles, int h){

        int start = 1;
        int end = maxElement(piles);
        int ans = Integer.MAX_VALUE;

        while(start<=end){
            int mid = start+(end-start)/2;
            int totalHours = 0;

            for(int i=0; i<piles.length; i++){
                totalHours += (int) Math.ceil((double) piles[i]/mid);
            }

            if(totalHours<=h){
                ans = Math.min(mid, ans);
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return ans;

    }

    public static int maxElement(int[] piles){

        int max = Integer.MIN_VALUE;
        for(int num : piles){
            max = Math.max(num, max);
        }

        return max;

    }

}
