package Arrays.Searching.BinarySearch.questions;

public class ShipWithinCapacity {

    public static void main(String[] args) {

        int[] weights = {3,2,2,4,1,4};
        int days = 3;

        // TC = O(n), will give Time exceed Error on LeetCode.
        System.out.println("Minimum capacity of Ship -> " + shipWithinDays(weights, days));

        // TC = O(log n)
        System.out.println("Minimum capacity of Ship -> " + shipWithinDays1(weights, days));

    }

    public static int shipWithinDays1(int[] weights, int days) {

        int min = greatestElement(weights);
        int max = sumOfWeights(weights);

        while(min<=max){
            int mid = min+(max-min)/2;
            int totalDays = days(mid, weights);

            if(totalDays<=days){
                max = mid-1;
            }
            else{
                min = mid+1;
            }

        }

        return min;

    }

    public static int shipWithinDays(int[] weights, int days) {

        int min = greatestElement(weights);
        int max = sumOfWeights(weights);

        for(int capacity=min; capacity<=max; capacity++){
            int totalDays = days(capacity, weights);

            if(totalDays<=days){
                return capacity;
            }
        }

        return -1;

    }

    public static int greatestElement(int[] weights){

        int maxElement = Integer.MIN_VALUE;

        for(int weight : weights){
            maxElement = Math.max(maxElement, weight);
        }

        return maxElement;

    }

    public static int days(int capacity, int[] weights){

        int day=1;
        int load=0;
        int size = weights.length;

        for(int i=0; i<=size-1; i++){
            load = load + weights[i];
            if(load>capacity){
                day = day+1;
                load = weights[i];
            }
        }

        return day;

    }

    public static int sumOfWeights(int[] weights){

        int sum = 0;
        int size = weights.length;

        for(int i=0; i<=size-1; i++){
            sum = sum + weights[i];
        }

        return sum;

    }

}
