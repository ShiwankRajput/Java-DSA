package Java_8.DefaulMethods;

public interface DefaultMethodDemo {

    void sayHello();

    default void sayBye(){
        System.out.println("Bye");
    }

}

class Child implements DefaultMethodDemo{

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}

class Main{

    public static void main(String[] args) {

        Child obj = new Child();
        obj.sayBye();

    }

}