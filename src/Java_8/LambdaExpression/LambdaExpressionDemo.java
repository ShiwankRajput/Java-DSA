package Java_8.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Shiwank","Dev","Tarang");

        names.forEach(name -> System.out.println(name));

    }

}
