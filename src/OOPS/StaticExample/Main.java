package OOPS.StaticExample;

public class Main {
    public static void main(String[] args) {

        Human shiwank = new Human(21,"Shiwank",60000,false);
        Human rahul = new Human(25,"Rahul",50000,true);

        System.out.println(Human.population);
        System.out.println(Human.population);

    }

    //static does not depend on objects.So,you cannot use non-static within it unless you create a object of it.
    static void fun(){
        //greeting();
    }

    //non-static depends on objects.
    void greeting(){
        System.out.println("hello world");
    }
}
