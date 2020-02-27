package epam.courses.module4.aggregationAndComposition.task4.bankAccount;

import epam.courses.module4.aggregationAndComposition.task4.client.Client;

public class BankAccount {
    private int accountNumber;
    private Client client;
    private boolean access = true;
    private int balance = 0;

    public BankAccount(int accountNumber, Client client){
        this.accountNumber = accountNumber;
        this.client = client;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Client getClient() {
        return client;
    }
}
