abstract class Account{
    void deposit(int amt){
        System.out.println("Deposit functionality");
    }
    abstract void withdraw(int amt);
}

class SavingsAccount extends Account{
    int balance;
    @Override
    void deposit(int amt) {
        balance += amt;
        System.out.println("Deposit successful.");
    }
    void withdraw(int amt){
        balance -=amt;
        System.out.println("Withdraw successful.");
    }

}

class CurrentAccount extends Account{
    int balance;
    @Override
    void deposit(int amt) {
        balance += amt;
        System.out.println("Deposit successful.");
    }
    void withdraw(int amt){
        balance -=amt;
        System.out.println("Withdraw successful.");
    }

}

public class BankAccount {
    public static void main(String[] args){

        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1000);
        sa.withdraw(500);
        
        CurrentAccount ca = new CurrentAccount();
        ca.deposit(2000);
        ca.withdraw(1000);
    }
    
}