package OOPS.InterfacesDemo.extendsDemo1;

public interface A {

    static void happy(){
        System.out.println("Feeling happy");
    }

    default void greet(){
        System.out.println("I am in A");
    }
}
