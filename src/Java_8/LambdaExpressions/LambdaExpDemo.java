package Java_8.LambdaExpressions;

public class LambdaExpDemo {

    public static void main(String[] args) {

        // Before lambda Function :

        /*

            MathOperation mathOperation = new MathOperation() {
                @Override
                public void add(int a, int b) {
                    System.out.println("Addition of a and b -> " + (a+b));
                }
            };

         */


        // After lambda function :

        MathOperation mathOperation = (int a, int b) -> System.out.println("Addition -> " + (a+b));
        mathOperation.add(5,4);

    }

}

@FunctionalInterface
interface MathOperation{

    void add(int a, int b);

    static void sub(int a, int b){
        System.out.println("Subtraction of a and b -> " + (a-b));
    }

    default void mul(int a, int b){
        System.out.println("Multiplication of a and b -> " + (a*b));
    }

}
