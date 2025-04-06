package OOPS.Generics.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(i+1);
        }

        Consumer<Integer> ans = item -> System.out.print(item*2 + " ");
        list.forEach(ans);
        System.out.println();
        list.forEach(item -> System.out.print(item*2 + " "));
        System.out.println();

        Operation sum = (a,b) -> a+b;
//        System.out.println(sum.operation(3,4));

        Operation product = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;

        LambdaFunction obj = new LambdaFunction();
        System.out.println(obj.operate(5,3,sum));
        System.out.println(obj.operate(5,5,product));
        System.out.println(obj.operate(5,3,sub));

    }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }

}

interface Operation{
    int operation(int a, int b);
}
