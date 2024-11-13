package Recursion;

public class sortedArray_or_not {

    public static void main(String[] args) {

        int[] arr = {1,2,6,7,98,100};

        System.out.println("Array sorted ? " + fun(arr,0));
    }

    static boolean fun(int[] arr,int i){

        if(i<arr.length-1 && arr[i]<arr[i+1]){
            return fun(arr,i+1);
        }
        else if(i == arr.length-1){
            return true;
        }

        return false;
    }
}
