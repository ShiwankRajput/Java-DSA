package CORE_JAVA.OOPS.StaticExample;

//outside classes cannot be static because it does not depends on other class, whereas innerClasses may
// or may not be static

public class StaticInnerClasses {

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
