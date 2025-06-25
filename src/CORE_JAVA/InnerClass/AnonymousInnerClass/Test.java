package CORE_JAVA.InnerClass.AnonymousInnerClass;

public class Test {

    public static void main(String[] args) {

        Shopping shopping = new Shopping(1000);

//        CreditCard card = new CreditCard("1X42");

        shopping.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid: " + amount + " using credit card");
            }
        });

        shopping.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid: " + amount + " using paypal");
            }
        });

    }

}
