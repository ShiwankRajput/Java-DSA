package OOPS.AccessModifier;

public class A {

    //private can be access only in this class, to access this we need getter and setters.
    private int num;
    //public can be access anywhere you want
    public String name;
    //default one can be access within the same package not outside that
    int[] arr;

    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
