package Java_8.MethodAndConstructorRef;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReference {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Shiwank","Dev","Tarang");
        List<Student> students = names.stream().map(x -> new Student(x)).collect(Collectors.toList());
        System.out.println(students.toString());
        List<Student> students1 = names.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students1.toString());

    }

}

class Student{

    private String name;
    private int age;

    public Student(String name) {
        this.name = name;
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
