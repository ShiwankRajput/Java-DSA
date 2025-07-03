package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }

}

class Main{

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Shiwank",8.4));
        students.add(new Student("Dev", 8.2));
        students.add(new Student("Tarang", 8.3));

        //sort method always return an integer value, so we needed to cast double to int
        students.sort((o1,o2) -> {
            if(o2.getGpa() - o1.getGpa() < 0){
                return -1; // I want gpa in descending order,just like you think of comparator
            }
            else if(o2.getGpa() - o1.getGpa() > 0){
                return 1;
            }
            else{
                return 0;
            }
        });

        for (Student s : students){
            System.out.println(s.getName() + " : " + s.getGpa());
        }

    }

}
