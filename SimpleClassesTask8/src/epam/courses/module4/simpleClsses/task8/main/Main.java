package epam.courses.module4.simpleClsses.task8.main;

import epam.courses.module4.simpleClsses.task8.customer.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Спиридонов", "Александр", "Григорьевич");
        String fullName = (customer.getName() + customer.getSurname() +
                customer.getPatronymic()).toLowerCase();
        System.out.println(fullName);

        String str1 = "a";
        String str2 = "A";
        int a = str1.compareToIgnoreCase(str2);
        System.out.println(a);





    }

}
