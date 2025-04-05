package OOPS.AbstractDemo;

public abstract class Parent {

    static int age;
    int marks;
    final int VALUE;

    public Parent(int age,int marks){
        Parent.age = age;
        this.marks = marks;
        VALUE = 3789;
    }

    static void hello(){
        System.out.println("heyy");
    }

    void message(){
        System.out.println("Good morning");
    }

    abstract void career();
    abstract void partner();

}
