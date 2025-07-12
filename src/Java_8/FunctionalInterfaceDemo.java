package Java_8;


@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void sayHello();

    default void sayBye(){

    }

    static void sayOk(){

    }

}

@FunctionalInterface
interface A extends FunctionalInterface{

    // now we cannot have any another abstract method because child class extends its parent which has only
    // one method which is abstract that makes parent class a Functional Interface.

    /*

        public void sayHello();    (correct)

        public void sayHappy();    (wrong)

     */

    default void sayNothing(){
        System.out.println("Happy");
    }

}
