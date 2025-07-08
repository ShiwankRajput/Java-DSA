package CollectionFramework.MapInterface;

// If we want to use custom sorting method then we use Comparable

// comparator jb chlta hai jb hume khudse logic likhna pdta hai jo ki natural ordering nhi hoti, ya phir
// huma multiple fields ke along sort krni hoti hai chize

// Comparable ek natural ordering btane ka tareeka hai

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComparableInterfaceExample {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Shiwank",8.42));
        list.add(new Student("Dev",8.11));
        list.add(new Student("Tarang",8.24));
        list.sort(null);
        System.out.println(list);

    }

}

class Student implements Comparable<Student>{

    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    // 4.compareTo(3)
    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(),this.getGpa());  // here this refers to 4
    }
}
