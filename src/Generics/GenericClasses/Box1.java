package Generics.GenericClasses;

// Bounded type parameter -> T is bounded to only Number class

public class Box1<T extends Number> {

    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

}
