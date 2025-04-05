package OOPS.AbstractDemo;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(20,80);
        son.career();
        System.out.println(son.marks);
        System.out.println(Parent.age);
        System.out.println(son.VALUE);

        Daughter dau = new Daughter(18,89);
        dau.career();
        System.out.println(dau.marks);
        System.out.println(Parent.age);
        System.out.println(dau.VALUE);

        Parent.hello();   //static method of parent abstract class

        son.message();
        dau.message();

        Parent obj = new Daughter(18,89);
        obj.career();  //reference is of parent class but override method points to class for which object is created.

//        Parent mom = new Parent();   Object for abstract class can't be created directly

    }
}
