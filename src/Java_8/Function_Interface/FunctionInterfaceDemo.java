package Java_8.Function_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {

        // (1) -> apply() method ->

        // In Java 8, the Function<T, R> interface is part of the java.util.function package.
        //It is used to represent a function that takes one input and returns one output.

        Function<String,Integer> function1 = x -> x.length();
        System.out.println(function1.apply("Shiwank"));

        Function<String,String> function2 = x -> x.substring(0,2);
        System.out.println(function2.apply("Shiwank"));

        Function<List<Student>, List<Student>> studentWithShAsPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li){
                if(function2.apply(s.getName()).equalsIgnoreCase("Sh")){
                    result.add(s);
                }
            }

            return result;

        };

        Student s1 = new Student("Shiwank",21);
        Student s2 = new Student("Shivam",22);
        Student s3 = new Student("Sarthak",21);
        List<Student> students = Arrays.asList(s1,s2,s3);
        System.out.println(studentWithShAsPrefix.apply(students).toString());



        // (2) -> andThen() ->

        // It is used to chain two functions — where the first function runs, and then the second function
        // runs on the result of the first.

        Function<String,String> function3 = x -> x.toUpperCase();
        Function<String,String> function4 = function3.andThen(function2);
        System.out.println(function4.apply("Shiwank"));


        // (3) -> compose() ->

        // The compose() method is used to chain two functions, but in reverse order compared to andThen().

        Function<String, String> function5 = function3.andThen(function2);
        System.out.println(function5.apply("Shiwank"));



        // (4) -> identity() ->

        // The identity() method is a static method in the Function interface.
        //It returns a function that returns its input as it is — no change.

        Function<String,String> function6 = Function.identity();
        System.out.println(function6.apply("Shiwank"));


    }

}

class Student{

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
