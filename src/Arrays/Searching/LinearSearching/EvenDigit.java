package Arrays.Searching.LinearSearching;

public class EvenDigit {

    public static void main(String[] args) {

        int[] arr = {35,575,-8997,-65,0,64};
        System.out.println("number of even digit number -> " + FindNumber(arr));
    }

    static int FindNumber(int[] arr){
        int count = 0;
        for (int element : arr){
            if(even_digits_number(element)){
                count++;
            }
        }

        return count;
    }

    static int digits_in_number(int num){
        int digit = 0;

        if(num == 0){
            return 1;
        }
        else if(num<0) {
            num *= -1;
        }

        while(num>0){
            digit++;
            num /= 10;
        }

        return digit;
    }

    static boolean even_digits_number(int element){

        return digits_in_number(element)%2 == 0;
    }
}
