package CORE_JAVA.OOPS.OOPS_3.Principles.Inheritance;

public class BoxWeight extends Box{

    double weight;
    double l;

    BoxWeight(double weight){
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    //Box box4 = new BoxWeight(4,5,2,10); this is same as above constructor


    BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);
        super.l = 5;
        this.weight = weight;
    }

}
