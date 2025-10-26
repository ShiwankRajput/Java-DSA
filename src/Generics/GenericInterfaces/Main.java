package Generics.GenericInterfaces;

public class Main {

    public static void main(String[] args) {

        GenericContainer<Integer> genericContainer = new GenericContainer<>();

        genericContainer.add(3);
        System.out.println(genericContainer.get());

    }

}
