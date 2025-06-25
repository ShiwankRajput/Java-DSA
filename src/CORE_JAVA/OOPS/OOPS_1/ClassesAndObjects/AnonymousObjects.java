package CORE_JAVA.OOPS.OOPS_1.ClassesAndObjects;

public class AnonymousObjects{
    public static void main(String[] args){

        /*

        Anonymous Objects ->

         */

        new B().f1();  // anonymous objects -> for accessing different methods of class B we need to
        // create object again and again.
        new B().f1();

        new B().f2();

    }
}

class B{
    public void f1(){
        System.out.println("B f1()");
    }
    public void f2(){
        System.out.println("B f2()");
    }
}
