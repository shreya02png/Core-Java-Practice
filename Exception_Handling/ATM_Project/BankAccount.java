
import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}
class InvalidAmountException extends Exception{
    public InvalidAmountException(String msg){
        super(msg);
    }
}
class Bank{
    private double balance;

    Bank(double balance) {
        this.balance=balance;
    }
    void deposit(double amount) throws InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException("Amount must be positive");
        }
        balance+=amount;
        System.out.println("successfully deposited!!!. Total balance - "+balance);
    }
    void withdraw(double amount) throws InsufficientBalanceException,InvalidAmountException{
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive");
        }

        if(balance<amount){
            throw new InsufficientBalanceException("Not enough balance");
        }
        
        balance -= amount;
        System.out.println("Successfully withdrawn!!!. Total balance - " + balance);
    }
    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bank b=new Bank(1000);
        while (true) {
            System.out.println("\n==== ATM MENU ====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            try{
            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    b.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    b.withdraw(w);
                    break;

                case 3:
                    System.out.print("Total amount: ");
                    b.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        } catch(InvalidAmountException | InsufficientBalanceException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
}
