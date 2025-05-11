package CORE_JAVA.OOPS.OOPS_1.ClassesAndObjects;

public class GarbageCollection {

    public static void main(String[] args) {

        for (int i=0; i<100000000; i++){
            A obj = new A("Shiwank",21);
        }

    }

}

class A{

    final int num = 10;
    String name;
    int age;

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*

    objects are destroyed by java itself, but we can perform some sort of action before or after an object is
    destroyed. Thus, here we use finalize method.

    */

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being destroyed");
    }

}
