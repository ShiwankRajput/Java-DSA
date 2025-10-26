package Generics.GenericClasses;

public class Test {
    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber(10);

        Boxx<MyNumber> boxx = new Boxx<>(myNumber);
        boxx.display();

    }

}

interface Printable{

    void print();

}

class MyNumber extends Number implements Printable{

    private final int value;

    public MyNumber(int value){
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("printing = " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}

// note -

// here first the class comes and then we mention all the interfaces, because we cannot extend multiple classes
// at same time, it is possible only for interfaces.

// we only uses the extends keyword not implements

class Boxx<T extends Number & Printable>{

    private T item;

    public Boxx(T item){
        this.item = item;
    }

    public void display(){
        item.print();
    }

}

