package Java_8.DefaulMethods;

interface A{
    default void sayHello(){
        System.out.println("Hello");
    }
}

interface B{
    default void sayHello(){
        System.out.println("Hello");
    }
}

public class CriticalExample implements A,B{

    public static void main(String[] args) {

        CriticalExample obj = new CriticalExample();
        obj.sayHello();

    }

    @Override
    public void sayHello() {
        A.super.sayHello();
    }
}
