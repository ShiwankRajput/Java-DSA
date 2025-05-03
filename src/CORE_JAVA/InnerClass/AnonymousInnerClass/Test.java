package CORE_JAVA.InnerClass.AnonymousInnerClass;

public class Test {

    public static void main(String[] args) {

        ShoppingCart s = new ShoppingCart(200);

        // CreditCardV0 is a class that implements Payment interface
        CreditCardV0 c = new CreditCardV0("123");
        s.paymentProcess(c);

        // this is called anonymous inner class
        s.paymentProcess(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using credit card");
            }
        });

        s.paymentProcess(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " GPay");
            }
        });

    }

}
