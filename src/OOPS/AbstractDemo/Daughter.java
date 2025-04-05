package OOPS.AbstractDemo;

public class Daughter extends Parent{

    public Daughter(int age, int marks){
        super(age,marks);
    }

    @Override
    void message() {
        System.out.println("Good night");
    }

    @Override
    void career() {
        System.out.println("I want to become a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Captain America");
    }

}
