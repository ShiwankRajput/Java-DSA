package CORE_JAVA.ExceptionHandling;

public class ExceptionExample2 {

    public static void main(String[] args) {

        //stack trace :

        //gives stack trace exception (if not used with try catch) :->  level1();


        try{
            level1();
        }
        catch(Exception e){
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (int i=0; i<stackTrace.length ; i++){
                System.out.println(stackTrace[i]);
            }

            // OR (use)

            // e.printStackTrace();
        }

    }

    public static void level3(){
        int[] array = new int[5];
        array[6] = 24;
    }

    public static void level2(){
        level3();
    }

    public static void level1(){
        level2();
    }
}
