package ClassesAndObjects;

public class Finalize_garbageCollection {

    public static void main(String[] args) {

        //for primitive we cannot change the value.
        final int a = 10;
//      a = 15;
        System.out.println(a);


        //we can change the value but cannot reassign it(means creating another object for it.)
        final Person p1 = new Person("Shiwank");
        p1.name = "Rajput";
        System.out.println(p1.name);

//        p1 = new ClassesAndObjects.Person("default name");
//        System.out.println(p1.name);


        //eg; garbage collection by java..
        Person p2;
        for(int i=0; i<1000000000; i++){
            p2 = new Person("Shiwank");
        }
    }
}

class Person{

    String name;

    Person(String name){
        this.name = name;
    }

    //in java we cannot delete an object,it is deleted manually deleted by java
    //but we can perform some action when java is deleting objects as garbage collection.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}