package CORE_JAVA.OOPS.OOPS_2.StaticExample;

public class Human {

    int age;
    String name;
    int Salary;
    boolean married;
    static int population; //this means it is common to everyone (everyone means to all object of this class)

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        Salary = salary;
        this.married = married;
        Human.population += 1;  // common to every object of class
    }

}
