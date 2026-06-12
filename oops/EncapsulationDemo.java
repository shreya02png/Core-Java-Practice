// Demonstrates encapsulation using private variables,
// getters/setters, and validation logic in a BankAccount system

class BankAccount{
    private String accountHolder;
    private double amount;

    BankAccount(String accountHolder,double amount){
        this.accountHolder=accountHolder;
        this. amount=amount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return amount;
    }

    //validation

    public void deposite(int balance){
        if(balance>0){
            amount+=balance;
            System.out.println(balance+ " deposited.");
        }
        else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double balance) {
        if (balance > 0 && balance <= amount) {
            amount -= balance;
            System.out.println(balance + " withdrawn.");
        } else {
            System.out.println("Invalid or insufficient balance!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Shreya", 1000);

        System.out.println(b1.getAccountHolder()
);
        System.out.println(b1.getBalance()
);

        b1.setAccountHolder("saloni");
        System.out.println(b1.getAccountHolder()
);
        b1.deposite(1000);

        b1.withdraw(500);
    }
}
