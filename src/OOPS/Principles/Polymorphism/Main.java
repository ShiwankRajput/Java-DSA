package OOPS.Principles.Polymorphism;

public class Main {

    public static void main(String[] args) {

        Shapes obj1 = new Shapes();
        Circle obj2 = new Circle();
        Triangle obj3 = new Triangle();

        obj1.area();
        obj2.area();

        Shapes obj4 = new Square();
        obj4.area();  //since we have learned that this will call method of shapes class, but it is calling the
        // method of square class. So, this is only possible just because of upcasting in overriding
    }
}
