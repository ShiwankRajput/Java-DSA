package CORE_JAVA.OOPS.OOPS_3.Principles.Inheritance;

public class TestBox {

    public static void main(String[] args) {

        Box box1 = new Box(4,3,8);
        System.out.println(box1.l + ", " + box1.h);
        box1.displayInformation();

        BoxWeight box2 = new BoxWeight(10);
        System.out.println(box2.weight + "," + box2.h);

        BoxWeight box3 = new BoxWeight(4,3,2,10);
        System.out.println(box3.weight + ", " + box3.h);

        //here the reference(box4) will decide which class properties, methods or variables would be access.
        Box box4 = new BoxWeight(4,5,2,10);
        System.out.println(box4.l);
        //System.out.println(box4.weight);  //here we cannot access weight because it is not the property of Box class.


        /*

        there are many variables in both parent and child classes.
        you are given access to variables that are in the ref type i.e. BoxWeight
        hence, you should have access to weight variable.
        this also means, that the ones you are trying to access should be initialised
        means weight should be initialised.
        but here, when the obj itself is of type parent class how will you initialise
        weight of child class. That is why it is giving error.

        */

        /*

        BoxWeight box5 = new Box(4,2,6);
        System.out.println(box5);

        */


    }

}
