import java.util.Scanner;
// Central  info of bank
class Bank{
    String name;
    int age;
    private int balance =0;
    void createAccount(String name, int age){
        this.name=name;
        this.age=age;
    }

    void setter(int amt){
        if(amt>0){
            balance+=amt;
        }else{
            System.out.println("Enter valid amt");
        }
    }

    int getter(){
        return balance;
    }
    void updater(int amt){
        if(balance < amt ){
            System.out.println("Insufficient balance");
        }else{
            balance-=amt;
            System.out.println("Amt withdraw Succesfully");
        }
    }
}


class Transaction extends Bank{

    void deposite(int amt){
        setter(amt);
        System.out.println("Amt deposite Successfully");
        checkBalance();
    }

    void withdraw(int amt){
        updater(amt);
        checkBalance();
    }

    void checkBalance(){
        System.out.println("Balance amt "+ getter());
    }

}

public class BankingSystem {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Transaction c1= new Transaction();
        // Account creation in bank class
        System.out.println("Account Creation done");
        c1.createAccount("Gokul", 19);

        // Transaction logic
        // works under transaction class
        while(true){
            System.out.println("===========Welcome to over bank===============");
            System.out.println("1. Deposite\n 2. Withdraw\n 3. Balance\n 4. Exit");
            System.out.println("Enter the your choice");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amt to deposite");
                    int amt=sc.nextInt();
                    c1.deposite(amt);
                    break;
                case 2:
                    System.out.println("Enter amt to withdraw");
                    int draw=sc.nextInt();
                    c1.withdraw(draw);
                    break;
                case 3:
                    c1.checkBalance();
                    break;
                case 4:
                    return;
            
                default:
                    System.out.println("Enter wrong option , Try validate option");
                    break;
            }

        }
        
    }
}
