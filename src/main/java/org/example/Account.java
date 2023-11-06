package org.example;


public class Account {
    private double balance;
    private int accountNumber;
    private static int accountCounter = 1;


    private Account(double initialBalance) {
        this.balance = initialBalance;
        this.accountNumber = accountCounter;
        accountCounter++;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountCounter() {
        return accountCounter;
    }

    public static Account CreateAccount(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Нельяз создать счет с отрицательным баллансом");
        }
        return new Account(amount);
    }

    public void Deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Нельзя внести отрицательную сумму");
        }
        balance += amount;
    }

    public void Withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException("Сумма снятия превышает остаток на счете");
        }
        balance -= amount;

    }

}
