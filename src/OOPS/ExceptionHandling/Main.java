package OOPS.ExceptionHandling;

public class Main {

    public static void main(String[] args) {

        int a = 56;
        int b = 0;

        //using try-catch block to handle error
        try{
            divide(a,b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this will always execute");
        }

        //using throws and throw keyword to handle exception
        divide(a,b);

    }

    static int divide(int a, int b) throws ArithmeticException{

        if(b == 0){
            throw new ArithmeticException("please do not divide it by zero");
        }

        return a/b;
    }

}
