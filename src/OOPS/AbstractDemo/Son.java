package OOPS.AbstractDemo;

public class Son extends Parent{

    public Son(int age,int marks){
        super(age,marks);
    }

    @Override
    void message() {
        super.message();
    }

    @Override
    void career() {
        System.out.println("I want to become a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Dixon");
    }
}
