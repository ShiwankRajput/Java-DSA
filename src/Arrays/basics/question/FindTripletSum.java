package Arrays.basics.question;

/*

Given an array arr[] and an integer target, determine if there exists a triplet in the array whose
sum equals the given target. Return true if such a triplet exists, otherwise, return false.

 */

public class FindTripletSum {

    public static void main(String[] args) {

        int[] arr = {1, 4, 45, 6, 10, 8};
        int target = 13;

        System.out.println(findTriplet(arr,target));
    }

    static boolean findTriplet(int[] arr, int target){

        for(int i=0; i<arr.length; i++){

            if(i == arr.length-2){
                return false;
            }

            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(target == (arr[i]+arr[j]+arr[k]) ){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
