package OOPS.Principles.Polymorphism;

public class Numbers {

    //this shows method overloading

    double sum(double a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

        Numbers obj = new Numbers();
        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(2,3,3));
        System.out.println(obj.sum(3.78, 3));
    }
}
