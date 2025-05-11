package CORE_JAVA.OOPS.OOPS_2.StaticExample;

//outside classes cannot be static because it does not depend on other class, whereas innerClasses may
// or may not be static

public class StaticInnerClasses {

    // static here means inner class does not depend on instance of outer class, so if we create object of
    // non-static inner class in main body it will give error as we need to create object of outer class
    //so that it can run
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Test a = new Test("Shiwank");
        System.out.println(a.name);
        
    }

}
