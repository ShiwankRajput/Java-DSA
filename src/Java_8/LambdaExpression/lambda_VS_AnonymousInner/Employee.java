package Java_8.LambdaExpression.lambda_VS_AnonymousInner;

public interface Employee {

    void getSalary();

    void getDesignation();

}


/*


    class Engineer implements Employee{

        @Override
        public void getSalary() {
            System.out.println("100000");
        }

        @Override
        public void getDesignation() {
            System.out.println("Java Full stack developer");
        }

    }


*/

interface A{

    String run();

}


class Main{

    static int a = 5;

    public static void main(String[] args) {

        Employee obj = new Employee() {
            @Override
            public void getSalary() {
                System.out.println("100000");
            }

            @Override
            public void getDesignation() {
                System.out.println("Full Stack Developer");
            }
        };

        obj.getSalary();
        obj.getDesignation();

        doSomething();

    }

    private static void doSomething(){

        A obj1 = () -> {
            a = 3;
            return "running";
        };

        System.out.println(obj1.run());


        A obj2 = new A() {

            int y = 10;

            @Override
            public String run() {
                this.y = 5;
                System.out.println(y);
                return "not running";
            }
        };

        System.out.println(obj2.run());

    }


}