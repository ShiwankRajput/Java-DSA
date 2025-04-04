package OOPS.Principles.Inheritance;

public class Parent {

    double l;
    double w;
    double h;

    private double perimeter = 78.00;

    public double getPerimeter(){
        return perimeter;
    }

    public Parent(){
        this.l = 1;
        this.w = 1;
        this.h = 1;
    }

    //will form cube
    public Parent(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Parent(double l, double w, double h){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Parent(Parent other){
        this.l = other.l;
        this.h = other.h;
        this.w = other.w;
    }

    public void display(){
        System.out.println("It is a parent class");
    }

}
