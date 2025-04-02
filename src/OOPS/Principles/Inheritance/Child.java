package OOPS.Principles.Inheritance;

public class Child extends Parent{

    //although it is a child class but cannot access the private context of parent class

    double weight;

    public Child (){
        this.weight = 1;
    }

    public Child(Child other){
        super(other);  //child class has context of parent class, thus it can happen
        weight = other.weight;
    }

    public Child(double side, double weight){
        super(15);
        this.weight = 15;
    }

    public Child(double l, double h, double w, double weight){
        super(l, w, h); //super is the keyword that calls parent class constructor
        this.weight = weight;
    }
}
