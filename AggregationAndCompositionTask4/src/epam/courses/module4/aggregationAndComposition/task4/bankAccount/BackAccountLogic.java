package epam.courses.module4.aggregationAndComposition.task4.bankAccount;

public class BackAccountLogic {
    private static BackAccountLogic backAccountLogic;

    private BackAccountLogic() {}

    public static BackAccountLogic getInstance() {
        if (backAccountLogic == null) {
            backAccountLogic = new BackAccountLogic();
        }
        return backAccountLogic;
    }

    public void blockBankAccount(BankAccount account){
        account.setAccess(false);
    }

    public void unlockBankAccount(BankAccount account){
        account.setAccess(true);
    }

    public void printBankAccount(BankAccount account) {
        System.out.println("номер счёта: " + account.getAccountNumber());
        System.out.println("сумма на счёте: " + account.getBalance());
        System.out.println("id клиента которому принадлежит счёт: " + account.getClient().getId());
    }
}
