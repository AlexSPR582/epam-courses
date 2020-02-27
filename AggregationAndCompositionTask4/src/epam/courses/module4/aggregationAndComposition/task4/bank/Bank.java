package epam.courses.module4.aggregationAndComposition.task4.bank;

import epam.courses.module4.aggregationAndComposition.task4.bankAccount.BankAccount;

import java.util.ArrayList;
import java.util.List;


public class Bank {
    private static Bank bank;

    private List<BankAccount> bankAccounts;

    private Bank(){
        this.bankAccounts = new ArrayList<>();
    }

    public static Bank getInstance(){
        if (bank == null){
            bank = new Bank();
        }
        return bank;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
