package CORE_JAVA.OOPS.StaticExample;

public class Main {

    public static void main(String[] args) {

        Human h1 = new Human(19,"Rahul",70000,false);
        Human h2 = new Human(28,"Ankit",100000,true);

        System.out.println(Human.population);
        System.out.println(Human.population);

    }

}
