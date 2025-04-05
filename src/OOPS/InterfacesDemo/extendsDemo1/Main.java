package OOPS.InterfacesDemo.extendsDemo1;

public class Main implements A,B{

    @Override
    public void greet1() {
        System.out.println("Good Evening");
    }


    @Override
    public void greet() {
        System.out.println("Good Afternoon");
    }

    public static void main(String[] args) {

        B obj = new Main();
        obj.greet1();

        A.happy();

    }
}
