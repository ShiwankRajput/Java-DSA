package Java_8.StaticMethods;

public interface StaticMethodDemo {

    static void sayHello(){
        System.out.println("Hello");
    }

    default void sayBye(){
        System.out.println("Bye");
    }

}

class Main implements StaticMethodDemo{

    public static void main(String[] args) {

        Main obj = new Main();
        obj.sayBye();
        /*

            obj.sayHello();   // cannot be called by object of implementation class as the method is static
                              // and if we try to override the method it can't be as static method cannot be
                              // overridden, if we try to override it, it means we are declaring another method.

         */

        StaticMethodDemo.sayHello();


    }

    // defining class method not overriding the method of interface.
    public void sayHello(){

    }

}
