package epam.courses.module4.aggregationAndComposition.task4.main;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
     счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
     всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

import epam.courses.module4.aggregationAndComposition.task4.bank.BankLogic;
import epam.courses.module4.aggregationAndComposition.task4.bankAccount.BackAccountLogic;
import epam.courses.module4.aggregationAndComposition.task4.client.Client;
import epam.courses.module4.aggregationAndComposition.task4.client.ClientLogic;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(123);
        Client client2 = new Client(456);
        Client client3 = new Client(923);
        ClientLogic cl = ClientLogic.getInstance();

        cl.createNewBankAccount(3455645, client1);
        cl.createNewBankAccount(7371233, client2);
        cl.createNewBankAccount(5120989, client1);
        cl.createNewBankAccount(2343543, client3);

        cl.setMoney(450, 3455645);
        cl.setMoney(1200, 7371233);
        cl.setMoney(500, 5120989);
        cl.setMoney(800, 2343543);

        BankLogic bl = BankLogic.getInstance();

        bl.printAllAccounts();

        System.out.println("СОРТИРОВКА ПО НОМЕРАМ СЧЁТА" + '\n');
        bl.sortBankAccountsByAccountNumber();
        bl.printAllAccounts();

        System.out.println("СОРТИРОВКА ПО БАЛАНСУ НА СЧЁТЕ" + '\n');
        bl.sortBankAccountsByBalance();
        bl.printAllAccounts();

        cl.getMoney(2000, 3455645);

        System.out.println("ОБЩАЯ СУММА ПО СЧЕТАМ: " + bl.calculateBalanceOfAllAccount());
        System.out.println("ОБЩАЯ СУММА ПО СЧЕТАМ С ПОЛОЖИТЕЛЬНЫМ БАЛАНСОМ: "
                + bl.calculateBalanceOfPlusAccounts());
        System.out.println("ОБЩАЯ СУММА ПО СЧЕТАМ С ОТРИЦАТЕЛЬНЫМ БАЛАНСОМ: "
                + bl.calculateBalanceOfMinusAccounts());

        System.out.println('\n' + "БЛОКИРОВКА СЧЁТА");
        bl.blockBankAccount(7371233);
        cl.getMoney(100, 7371233);
        BackAccountLogic.getInstance().printBankAccount(bl.findBankAccount(7371233));

        System.out.println('\n' + "РАЗБЛОКИРОВКА СЧЁТА");
        bl.unlockBankAccount(7371233);
        cl.getMoney(100, 7371233);
        BackAccountLogic.getInstance().printBankAccount(bl.findBankAccount(7371233));
    }
}
