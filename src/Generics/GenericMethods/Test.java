package Generics.GenericMethods;

public class Test {

    public static void main(String[] args) {

        Test test = new Test();
        test.displayValue("Shiwank");

        Test test1 = new Test();
        test.displayValue(1);

        Integer[] array = {1,2,3,4,5};
        test.displayArray(array);

        String[] array1 = {"Java","Python","C++","C"};
        test.displayArray(array1);

    }

    public <T> void displayValue(T value){

        System.out.println("Value provided is -> " + value);

    }

    public <T extends Number> void displayValue(T value){

        System.out.println("Value provided is -> " + value);

    }

    public <T> void displayArray(T[] array){

        for (T value : array){
            System.out.println(value);
        }

    }


}
