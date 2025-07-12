package Java_8.MethodAndConstructorRef;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public void print(String s){
        System.out.println(s);
    }

    public void hello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {

        MethodReference obj = new MethodReference();

        List<String> list = Arrays.asList("Shiwank","Dev","Tarang");
        list.forEach(x -> System.out.println(x));
        list.forEach(obj::print); //using function in loop with help of method reference in place of lambda exp.

    }

}
