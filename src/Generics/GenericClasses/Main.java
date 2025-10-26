package Generics.GenericClasses;

public class Main {

    public static void main(String[] args) {

        /*

            // BEFORE GENERIC -

            Box box = new Box();
            box.setValue(1);
            int i = (Integer) box.getValue();
            System.out.println(i);

        */


        // AFTER GENERIC -

        Box<String> box = new Box<>();
        box.setValue("Shiwank");
        String name = box.getValue();
        System.out.println(name);

        Pair<String, Integer> pair = new Pair<>("A",1);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        Box1<Integer> box1 = new Box1<>();
        box1.setValue(1);
        System.out.println(box1.getValue());

    }

}
