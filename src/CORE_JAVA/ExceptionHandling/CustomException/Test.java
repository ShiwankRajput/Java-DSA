package CORE_JAVA.ExceptionHandling.CustomException;

public class Test {

    public static void main(String[] args) {

        BankAccount bk = new BankAccount(10);

        try{
            bk.withdraw(11);
        }
        catch(InsufficientFundsException e){
            System.out.println(e.getBalance());
            System.out.println(e.getMessage());
        }
    }
}
