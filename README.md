# Simple Banking-System
## Introduction 
A simple banking system that can create two types of account; Savings and Regular account. It both have similar fuction like withdraw, and deposit, however the Savings account implement a penalty for when the withdraw exceed the balance and also calculate and add interestrate whenever the user make a deposit.

## Features
### 1. Account
* Savings Account
* Regular
### 2. Function
* Withdraw
* Deposit

## Object-Oriented Features
This project consist of 3 classes:
* SavingsAccount: subclass
* Accounts: superclass
* BankingSystem: main class

## Inheritance
The "SavingsAccount" class extends from "Account" class, which mean they share a similar methods like withdraw and deposit.
```java
class Account {
    private String accountNumber;
    private String accountHolder;
    private String accounttype;
    protected double balance;
```
``` java
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, String type, double balance, double interestRate) {
        super(accountNumber, accountHolder, type, balance);
        this.interestRate = interestRate;
    }
```
## Encapsulation
* private: accessible within the same class "Account" and not visible to subclass "SavingsAccount". We use private to ensure their the value can only be changed inside "Account" class.
``` java
    private String accountNumber;
    private String accountHolder;
    private String accounttype;
```
* protected: we use 'protected double balance' variable here in "Account" class so that it is accessible to subclass "SavingsAccount".
``` java
    protected double balance;
```

## Polymorphism
* Overriding Method: override the withdraw method in "SavingsAccount" class to applied a behavior "penalty" for when the withdrawal exceed the balance.
``` java
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
```



