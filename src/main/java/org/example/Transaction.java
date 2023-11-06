package org.example;

public class Transaction {
    private Account debitAcc;
    private Account creditAcc;
    private double amount;

    public Transaction(Account debitAcc, Account creditAcc, double amount) {
        this.debitAcc = debitAcc;
        this.creditAcc = creditAcc;
        this.amount = amount;
    }
    public void Transfer (){
        debitAcc.Deposit(amount);
        creditAcc.Withdraw(amount);
    }
}
