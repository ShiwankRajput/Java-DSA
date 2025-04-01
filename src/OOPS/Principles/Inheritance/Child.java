package OOPS.Principles.Inheritance;

public class Child extends Parent{

    double weight;

    public Child (){
        this.weight = 1;
    }

    public Child(double l, double h, double w, double weight){
        super(l, w, h); //super is the keyword that calls parent class constructor
        this.weight = weight;
    }
}
