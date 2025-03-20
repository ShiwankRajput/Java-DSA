package Recursion.Level1;

public class CountZEROES {

    public static void main(String[] args) {

        int num = 5020200;
        System.out.println("Number of zeroes in a number -< " + countZeroes(num,0));
    }

    static int countZeroes(int num, int count){

        if(num<=0){
            return count;
        }

        if(num%10 == 0){
            return countZeroes(num/10,count+1);
        }

        return countZeroes(num/10,count);
    }
}
