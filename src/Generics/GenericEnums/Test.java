package Generics.GenericEnums;

enum Operation {

    ADD, SUBTRACT, MULTIPLY, DIVIDED;

    public <T extends Number> double performOperation(T a, T b){

        switch (this){
            case ADD : return a.doubleValue()+b.doubleValue();

            case SUBTRACT : return a.doubleValue()-b.doubleValue();

            case MULTIPLY: return a.doubleValue()*b.doubleValue();

            case DIVIDED: return a.doubleValue()/b.doubleValue();

            default: throw new RuntimeException("Unknown operation -> " + this);
        }

    }

}

public class Test {

    public static void main(String[] args) {

        System.out.println(Operation.ADD.performOperation(10,20));

        System.out.println(Operation.SUBTRACT.performOperation(10.5,5.5));

    }

}
