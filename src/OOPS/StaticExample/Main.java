package OOPS.StaticExample;

public class Main {

    public static void main(String[] args) {

        Human h1 = new Human(15,"Shiwank",15000,false);
        Human h2 = new Human(25,"Dev",15000,true);

        System.out.println(h1.name);
        System.out.println(h2.name);
        System.out.println(Human.population); //since population is static so it is accessed by class name not object
        System.out.println(Human.population);

    }

}
