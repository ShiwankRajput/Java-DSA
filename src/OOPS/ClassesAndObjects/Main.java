package ClassesAndObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //store 5 roll_numbers:
        int[] roll_no = new int[5];
        System.out.println(Arrays.toString(roll_no));

        //store 5 names:
        String[] names = new String[5];
        System.out.println(Arrays.toString(names));

        //store 5 students with (rno,name,marks):
        Student s1 = new Student(15);
//        s1.rno = 13;
//        s1.name = "Shiwank";
//        s1.marks = 85.56f;
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        Student s2 = new Student(14,"Rajput",86);
        System.out.println(s2.rno);
        System.out.println(s2.name);
        System.out.println(s2.marks);

        //eg; constructor within constructor
        Student s3 = new Student();
        System.out.println(s3.rno);
        System.out.println(s3.name);
        System.out.println(s3.marks);
    }
}

class Student{

    int rno;
    String name;
    float marks;

    Student(int rno) {
        this.rno = rno;
        this.name = "Shiwank";
        this.marks = 85.56f;
    }

    Student(int rno,String name,float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    //calling constructor within constructor..
    Student(){
        this(13);
    }

}
