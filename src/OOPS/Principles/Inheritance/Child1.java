package OOPS.Principles.Inheritance;

public class Child1 extends Child{

    double price;

    public Child1(){
        this.price = 50;
    }

    public Child1(double l, double w, double h, double weight, double price){
        super(3,3,10,15);
        this.price = price;
    }

    public Child1(double side, double price){
        super(5,15);
        this.price = price;
    }

}
