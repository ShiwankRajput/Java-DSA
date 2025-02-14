package OOPS.StaticExample;

public class InnerClasses {

    //hence class A is need to be static because it depends on outside class due to which without static its object can't be created.
    //but if it does not depends on outside class then there is no need to be static.
    static class A{
        String name;

        public A(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {

        A obj1 = new A("Shiwank");
        A obj2 = new A("Rahul");
    }
}
