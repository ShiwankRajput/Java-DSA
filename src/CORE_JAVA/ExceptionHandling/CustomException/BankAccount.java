package CORE_JAVA.ExceptionHandling.CustomException;

public class BankAccount {

    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount > balance){
            System.out.print("Your Balance is -> ");
            throw new InsufficientFundsException(balance);
        }

        balance = balance - amount;
    }
}
