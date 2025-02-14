package OOPS.StaticExample;

// initialisation of static variables...
// as soon as the class loads firstly all the static members will be executed.

public class StaticInitialisation {

    static int a = 4;
    static int b;

    // will only runs one when the first obj is created i.e when the class loads for the first time.
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInitialisation obj1 = new StaticInitialisation();
        System.out.println(StaticInitialisation.a+" "+StaticInitialisation.b);

        StaticInitialisation.b += 3;

        System.out.println(StaticInitialisation.a+" "+StaticInitialisation.b);

        StaticInitialisation obj2 = new StaticInitialisation();
        System.out.println(StaticInitialisation.a+" "+StaticInitialisation.b);
    }
}
