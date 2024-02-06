class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, String accountType, double balance, double interestRate) {
        super(accountNumber, accountHolder, accountType, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double withdrewamount) {
        System.out.println("Enter the amount you want to withdraw:");
        withdrewamount = scanner.nextDouble();
        if (withdrewamount  <= balance) {
            super.withdraw(withdrewamount);
        } else {
            double penalty = withdrewamount * interestRate / 100;
            balance -= penalty;
            showAccount();
        }
    }


    public void calculateInterest(double depositamount) {
        System.out.println("Enter the amount you want to deposit:");
        depositamount = scanner.nextDouble();
        if (depositamount > 0){
            double interest = (balance + depositamount) * this.interestRate / 100;
            balance += depositamount + interest;
            System.out.println("Deposit Successfully. " + "$" + interest + " interest has been added to your balance.");
            showAccount();
        } else {
            System.out.println("Invalid deposit amount. Deposit failed.");
        }
    }

}
