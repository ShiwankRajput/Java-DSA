package Java_8.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceDemo {

    public MethodReferenceDemo(){
        System.out.println("Method Reference Demo");
    }

    public static void main(String[] args) {

        // static method reference :
        MathOperation mathOperation = MethodReferenceDemo::saySomething1;
        mathOperation.say();

        // instance method reference :
        MethodReferenceDemo obj = new MethodReferenceDemo();
        MathOperation mathOperation1 = obj::saySomething2;
        mathOperation1.say();

        // Reference to Instance Method of an Arbitrary Object:
        List<String> names = Arrays.asList("Shiwank","Dev");
        names.forEach(System.out::println);

        // constructor reference:
        Supplier<MethodReferenceDemo> supplier = MethodReferenceDemo::new;
        supplier.get();

    }

    public static void saySomething1(){
        System.out.println("Performing math operation");
    }

    public void saySomething2(){
        System.out.println("Performing advance math operation");
    }

    static void add(int a, int b){
        System.out.println("Addition -> " + (a+b));
    }

}

interface MathOperation{

    void say();

}
