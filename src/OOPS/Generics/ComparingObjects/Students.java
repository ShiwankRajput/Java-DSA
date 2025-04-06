package OOPS.Generics.ComparingObjects;

public class Students implements Comparable<Students>{

    int rollNo;
    float marks;

    public Students(int rollNo, float marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Students o) {

        int diff = (int) (this.marks - o.marks);
        return diff;

        //if diff==0 : means both are equal
        //if diff<0 : means o is bigger else o is smaller
    }
}

class Main{

    public static void main(String[] args) {

        Students obj = new Students(13,89.78f);
        Students obj1 = new Students(14,98.83f); // o means older and this is older

        if(obj.compareTo(obj1) < 0){
            System.out.println(obj.compareTo(obj1));
            System.out.println("obj1 has more marks");
        }

    }
}
