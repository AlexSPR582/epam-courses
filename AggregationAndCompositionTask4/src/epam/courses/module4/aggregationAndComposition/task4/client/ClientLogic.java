package epam.courses.module4.aggregationAndComposition.task4.client;

import epam.courses.module4.aggregationAndComposition.task4.bank.Bank;
import epam.courses.module4.aggregationAndComposition.task4.bank.BankLogic;
import epam.courses.module4.aggregationAndComposition.task4.bankAccount.BankAccount;

public class ClientLogic {
    private static ClientLogic clientLogic;

    private ClientLogic() {}

    public static ClientLogic getInstance() {
        if (clientLogic == null) {
            clientLogic = new ClientLogic();
        }
        return clientLogic;
    }

    public void createNewBankAccount(int accountNumber, Client client) {
        if (!BankLogic.getInstance().isBankAccountAlreadyExist(accountNumber)) {
            Bank.getInstance().getBankAccounts().add(
                    new BankAccount(accountNumber, client));
        }
    }

    public void setMoney(int money, int accountNumber) {
        BankAccount account = BankLogic.getInstance().findBankAccount(accountNumber);
        if (account != null && account.isAccess()) {
            account.setBalance(account.getBalance() + money);
        }
    }

    public void getMoney(int money, int accountNumber) {
        BankAccount account = BankLogic.getInstance().findBankAccount(accountNumber);
        if (account != null && account.isAccess()) {
            account.setBalance(account.getBalance() - money);
        }
    }
}
