package CORE_JAVA.OOPS.OOPS_1.ClassesAndObjects;

public class ClassesObjects {

    public static void main(String[] args) {

        // store 5 roll numbers of student :
        int[] rollNo = new int[5];

        // store 5 names of student :
        String[] name = new String[5];

        // creating own dataType using class with three properties as rollNo, name and marks :
        Student student1 = new Student(13,"Rahul",85.22f);
        Student student2 = new Student(10,"Kartik",80.22f);

        System.out.println(student1.marks);
        System.out.println(student2.rollNo);
        student1.changeName("Shiwank");
        student1.greeting();
        student2.greeting();

        Student random = new Student(student1);
        System.out.println(random.name);
        System.out.println(random.marks);


        // (1) - random1 and random2 points to same object in heap memory
        // (2) - when a non primitive is final you can't reassign it, but can change its value

        /*

            eg, final Student random1 = new Student();
                random1 = new Student();   //this can't be happen

        */


        final Student random1 = new Student();
        Student random2 = random1;
        System.out.println(random1.name);
        System.out.println(random2.name);
        random2.name = "Shubham";
        System.out.println(random1.name);
        System.out.println(random2.name);


    }

}


//creating class :
class Student{

    int rollNo;
    String name;
    float marks;


    //calling constructor within constructor..
    public Student(){
        this(10,"Raj",77.85f);
    }

    public Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public Student(Student other){
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }

    void changeName(String newName){
        this.name = newName;
    }

    void greeting(){
        System.out.println("Hello my name is -> " + this.name);
    }

}
