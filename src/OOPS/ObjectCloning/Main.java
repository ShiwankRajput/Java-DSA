package OOPS.ObjectCloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{

        Human obj = new Human(19,"Shiwank");
        System.out.println(Arrays.toString(obj.arr));

//        Human obj1 = new Human(obj);  // no need to create same object using new

        Human obj1 = (Human)(obj.clone());
        System.out.println(obj1.age + " " + obj1.name);
        obj.arr[0] = 100;
        System.out.println(Arrays.toString(obj.arr));
        System.out.println(Arrays.toString(obj1.arr));


    }

}
