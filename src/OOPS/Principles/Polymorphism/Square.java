package OOPS.Principles.Polymorphism;

public class Square extends Shapes{

    //this shown method overriding

    @Override
    void area(){
        System.out.println("Area is -> side * side");
    }
}
