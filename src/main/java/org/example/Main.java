package org.example;

public class Main {
    public static void main(String[] args) {
        Account acc1 = null;
        Account acc2 = null;
        //======================================================================
        // Создание счета
        try {
            acc1 = Account.CreateAccount(1);
            System.out.println("Счет успешно создан");
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        try {
            acc2 = Account.CreateAccount(-2);
            System.out.println("Счет успешно создан");
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        //======================================================================
        //Пополение счета
        try {
            acc1.Deposit(4);
            System.out.println("Сумма успешно внесена на счет");
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());;
        }
        try {
            acc1.Deposit(-4);
            System.out.println("Сумма успешно внесена на счет");
        }
        catch (IllegalArgumentException e){
            System.err.println(e.getMessage());;
        }
        //======================================================================
        //Снятие со счета
        try {
            acc1.Withdraw(2);
            System.out.println("Сумма успешно снята со счета");
        }
        catch (InsufficientFundsException e){
            System.err.println(e.getMessage());
        }
        try {
            acc1.Withdraw(100);
            System.out.println("Сумма успешно снята со счета");
        }
        catch (InsufficientFundsException e){
            System.err.println(e.getMessage());
        }
        //======================================================================
        //Перевод между счетами
        acc2 = Account.CreateAccount(21);
    Transaction transaction = new Transaction(acc1, acc2, 50);
        try {
            transaction.Transfer();
        }
        catch (InsufficientFundsException e){
            System.err.println("Какая-то беда с переводом. " + e.getMessage());
        }
    }
}