package CORE_JAVA.WrapperClass;

public class Test {

    public static void main(String[] args) {

        // a is a primitive variable and 1 is stored in stack
        int a = 1;

        // b is reference of Integer class, can't be said as primitive variable and 1 is stored in heap
        Integer b = 1;

        Float f = 1.2f;
        Boolean isAdult = true;


        /*

            AutoBoxing :-

            Integer c = Integer.valueOf(2);  Integer.valueOf() is done by java itself, we have
                                                            to just write - Integer c = 2;


            AutoUnBoxing :-

            int d = c.intValue();    .intValue is done by java itself, we have to write - int d = c;

        */


        Integer c = Integer.valueOf(2);
        int d = c.intValue();

        int a1 = 2;
        int b1 = 3;
        System.out.println(Integer.max(a1,b1));


    }

}
