package CORE_JAVA.InnerClass.AnonymousInnerClass;

public class Shopping {

    private double totalAmount;

    public Shopping(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }

}
