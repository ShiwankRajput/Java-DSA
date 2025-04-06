package OOPS.ObjectCloning;

public class Human implements Cloneable{

    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[] {3,4,5,6,7,8};
    }

    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        //this is known as shallow copy
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{
        Human obj1 = (Human)super.clone();  //this is shallow copy

        //making deep copy
        obj1.arr = new int[obj1.arr.length];
        for (int i=0; i<obj1.arr.length; i++){
            obj1.arr[i] = this.arr[i];
        }

        return obj1;

    }

}
