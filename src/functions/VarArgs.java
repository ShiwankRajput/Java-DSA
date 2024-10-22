package functions;

import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(2,"shiwank","kumar","rajput");
    }

    // this (...) takes an array of elements for any number of value
    //var args should present at last of arguments in function.
    static void fun(int a, String ...b){
        System.out.println(a+ " " +Arrays.toString(b));
    }
}
