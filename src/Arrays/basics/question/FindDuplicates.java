package Arrays.basics.question;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,2,5,3,4,5};

        System.out.println(arr[find(arr)]);
        System.out.println(optiminalFind(arr));
    }

    static int find(int[] arr){

        int count = 1;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }

                if(count == 2){
                    return j;
                }
            }

        }

        return -1;  //if a particular element is not present twice.
    }

    static int optiminalFind(int[] arr){

        int ans = 0;

        for (int i=0; i<arr.length ; i++){
            ans = ans ^ arr[i];
        }

        for(int i=1; i<arr.length; i++){
            ans = ans ^ i;
        }

        return ans;
    }
}
