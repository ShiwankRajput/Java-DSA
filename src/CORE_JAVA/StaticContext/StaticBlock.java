package CORE_JAVA.StaticContext;

public class StaticBlock {

    private static String name;
    private static int age;

    // static block is called first as static context get the memory at runtime first when the class is loaded
    // before main(), static is loaded by classloader of JVM.
    static {
        System.out.println("Within static block");
        name = "Shiwank";
        age = 21;
    }

    public static void main(String[] args) {

        System.out.println("Within main block");
        System.out.println(name);
        System.out.println(age);

    }

}
