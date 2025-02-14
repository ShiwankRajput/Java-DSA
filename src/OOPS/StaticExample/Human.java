package OOPS.StaticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static int population;  //common to all human so it is to be static

    public Human(int age,String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

    static void message() {
        System.out.println("message is forwarded");
//        System.out.println(this.age);  //this belongs to object and static does not require objects.thus,gives error
    }
}
