class BankingSystem {
    public static void main(String[] args) {
        Account Account1 = new Account("000001", "manuth", "regular", 0);
        SavingsAccount Account2 = new SavingsAccount("000002", "hour", "savings", 0, 1);
        // Account1.showAccount();
        // Account1.deposit(0);
        // Account1.withdraw(0);
       

        Account2.showAccount();
        // Account2.withdraw(0);
        // Account2.calculateInterest(0);
        
    }
}