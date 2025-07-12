package Java_8.LambdaExpression;


@FunctionalInterface
public interface Employee {

    String EmployeePosition();

}


/*


    class Engineer implements Employee{

        @Override
        public String EmployeePosition() {
            return "Software Engineer";
        }
    }


*/

class Main {

    public static void main(String[] args) {

        Employee obj = () -> "Software Engineer";   // in place of this lambda expression we can also define
                                                    // anonymous Class

        System.out.println(obj.EmployeePosition());


    }

}
