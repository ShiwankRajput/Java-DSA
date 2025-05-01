package CORE_JAVA.ExceptionHandling;

public class ExceptionExample1 {

    public static void main(String[] args) {

        int[] numerators = {10,200,30,40};
        int[] denominators = {1,2,0,4};
        for (int i=0; i<6; i++){
            try{
                System.out.println(divide(numerators[i],denominators[i]));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("GOOD job : ");
    }

    public static int divide(int a, int b){

        try{
            return a/b;
        }
        //this shows Arithmetic or NullPointerException will occur.
        catch (ArithmeticException | NullPointerException e){
            return -1;
        }
        catch(Exception e){
            return -1;
        }
        finally {
            System.out.println("Bye");
        }

        //we can use multiple catch block but the hierarchy should be like this

    }
}
