package OOPS.StaticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("hello everyone");
        // System.out.println(this.age);  //this can't be used here as it belongs to instance.
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }

}
