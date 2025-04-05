package OOPS.InterfacesDemo.extendsDemo1;

public interface B{

    void greet1();

    default void greet(){
        System.out.println("I am in B");
    }
}
