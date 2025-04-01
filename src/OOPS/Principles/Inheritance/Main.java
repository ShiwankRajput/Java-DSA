package OOPS.Principles.Inheritance;

public class Main {

    public static void main(String[] args) {

        Parent obj1 = new Parent();
        System.out.println(obj1.l + " " + obj1.w + " " +obj1.h);

        Child obj2 = new Child();
        System.out.println(obj2.weight);
        System.out.println(obj2.l);

        Child obj3 = new Child(3,4,5,8);
        System.out.println(obj3.l);

    }


}
