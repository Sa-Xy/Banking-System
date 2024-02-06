import java.util.Scanner;

class Account {
    private String accountNumber;
    private String accountHolder;
    private String accounttype;
    protected double balance;
    Scanner scanner = new Scanner(System.in);

    public Account(String accountNumber, String accountHolder, String accounttype, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accounttype = accounttype;
        
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getType(){
        return accounttype;
    }

    public void showAccount() {  
        System.out.println("Name of account holder: " + accountHolder);  
        System.out.println("Account no.: " + accountNumber);  
        System.out.println("Account type: " + accounttype);  
        System.out.println("Balance: $" + balance);  
    }  

    public void deposit(double depositamount) {
        System.out.println("Enter the amount you want to deposit:");
        depositamount = scanner.nextDouble();
        this.balance += depositamount;
        System.out.println("Deposit successful.");
        showAccount();
        
    }   

    public void withdraw(double withdrewamount) {
        System.out.println("Enter the amount you want to withdraw:");
        withdrewamount = scanner.nextDouble();
        if (withdrewamount <= balance) {
            this.balance -= withdrewamount;
            System.out.println("Withdrawal successful.");
            showAccount();
            
            
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
            showAccount();
        }
    }


}


