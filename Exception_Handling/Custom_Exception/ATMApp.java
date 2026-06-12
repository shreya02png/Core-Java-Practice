class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg){
        super(msg);
    }
}

class ATM{
    int balance=1000;

    void withdraw(int amount) throws InsufficientBalanceException{
        if(balance<amount){
            throw new InsufficientBalanceException("insufficient balance");
        }
        balance-=amount;
        System.out.println("Withdraw successful. Remaining balance: " + balance);
    }
}

public class ATMApp {
    public static void main(String[] args) {
        ATM atm=new ATM();
        try {
            atm.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues...");
    }
}