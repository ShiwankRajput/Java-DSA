package OOPS.InterfacesDemo1.extendsDemo;

public class Main implements B {

    @Override
    public void greet() {
        System.out.println("Good morning");
    }

    @Override
    public void greet1() {
        System.out.println("Good night");
    }

    public static void main(String[] args) {

        B obj1 = new Main();
        obj1.greet();
        obj1.greet1();

        A obj2 = new Main();
        obj2.greet();
//        obj2.greet1();

    }
}
