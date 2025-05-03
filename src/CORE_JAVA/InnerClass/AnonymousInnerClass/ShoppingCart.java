package CORE_JAVA.InnerClass.AnonymousInnerClass;

public class ShoppingCart {

    private double totalAmount;

    public ShoppingCart(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public void paymentProcess(Payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }

}
