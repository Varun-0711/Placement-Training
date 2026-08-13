java.util.*;
 BankAccount{
    int balance;
    BankAccount(int balance){
        this.balance = balance;
    }
    void withdraw(int amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}
public class CustomExceptions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initial balance for the bank account: ");
        int i = sc.nextInt();
        BankAccount account = new BankAccount(i);

        System.out.print("Enter amount to withdraw: ");
        int n=sc.nextInt();
        try{
            account.withdraw(n);
        }catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}