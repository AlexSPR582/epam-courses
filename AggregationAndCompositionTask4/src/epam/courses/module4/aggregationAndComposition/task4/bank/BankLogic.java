package epam.courses.module4.aggregationAndComposition.task4.bank;

import epam.courses.module4.aggregationAndComposition.task4.bankAccount.BackAccountLogic;
import epam.courses.module4.aggregationAndComposition.task4.bankAccount.BankAccount;

import java.util.Comparator;

public class BankLogic {
    private static BankLogic bankLogic;

    private BankLogic() {}

    public static BankLogic getInstance() {
        if (bankLogic == null) {
            bankLogic = new BankLogic();
        }
        return bankLogic;
    }

    public int calculateBalanceOfAllAccount(){
        int sum = 0;
        for (BankAccount bankAccount: Bank.getInstance().getBankAccounts()){
            sum += bankAccount.getBalance();
        }
        return sum;
    }

    public int calculateBalanceOfPlusAccounts(){
        int sum = 0;
        for (BankAccount bankAccount: Bank.getInstance().getBankAccounts()){
            if (bankAccount.getBalance() > 0){
                sum += bankAccount.getBalance();
            }
        }
        return sum;
    }

    public int calculateBalanceOfMinusAccounts(){
        int sum = 0;
        for (BankAccount bankAccount: Bank.getInstance().getBankAccounts()){
            if (bankAccount.getBalance() < 0){
                sum += bankAccount.getBalance();
            }
        }
        return sum;
    }

    public void sortBankAccountsByAccountNumber() {
        Comparator<BankAccount> comparator = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount account1, BankAccount account2) {
                return account1.getAccountNumber() - account2.getAccountNumber();
            }
        };
        Bank.getInstance().getBankAccounts().sort(comparator);
    }

    public void sortBankAccountsByBalance() {
        Comparator<BankAccount> comparator = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount account1, BankAccount account2) {
                return account1.getBalance() - account2.getBalance();
            }
        };
        Bank.getInstance().getBankAccounts().sort(comparator);
    }

    public void blockBankAccount(int accountNumber){
        BackAccountLogic.getInstance().blockBankAccount(findBankAccount(accountNumber));
        System.out.println("счёт заблокирован");
    }

    public void unlockBankAccount(int accountNumber){
        BackAccountLogic.getInstance().unlockBankAccount(findBankAccount(accountNumber));
        System.out.println("счёт разблокирован");
    }

    public boolean isBankAccountAlreadyExist(int accountNumber) {
        if (findBankAccount(accountNumber) != null) {
            System.out.println("Счёт с таким номером уже существует");
            return true;
        }
        return false;
    }

    public void printAllAccounts() {
        for (BankAccount account: Bank.getInstance().getBankAccounts()) {
            BackAccountLogic.getInstance().printBankAccount(account);
            System.out.println();
        }
    }

    public BankAccount findBankAccount(int accountNumber) {
        for (BankAccount account: Bank.getInstance().getBankAccounts()) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
