package CORE_JAVA.ExceptionHandling.CustomException;

// creating own custom Exception name :-> InsufficientFundsException

public class InsufficientFundsException extends Exception{

    private double balance;

    public InsufficientFundsException(double balance){
        super("Insufficient balance. You can't withdrawn it");  //calling getMessage of parent class name Exception
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
}
