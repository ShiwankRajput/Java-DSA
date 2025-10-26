package Generics.GenericConstructor;

// For a generic constructor, It is not necessary to keep the class as generic.
class Box2{

    public <T extends Number> Box2(T value){

    }

}

public class Test {
    public static void main(String[] args) {

        Box2 box2 = new Box2(1);

    }
}
