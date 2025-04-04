package OOPS.AccessModifier;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        A obj = new A(10,"Shiwank");

        System.out.println(Arrays.toString(obj.arr));
        obj.setNum(11);
        System.out.println(obj.getNum());
    }
}
