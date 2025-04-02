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

        Parent obj4 = new Child(2,4,5,10);
//        System.out.println(obj4.weight);

//        Child obj5 = new Parent(2,3,5);

        Child obj6 = new Child(obj2);
        System.out.println(obj6.l);

        Child1 obj7 = new Child1(5,60);
        System.out.println(obj7.price);



    }


}
