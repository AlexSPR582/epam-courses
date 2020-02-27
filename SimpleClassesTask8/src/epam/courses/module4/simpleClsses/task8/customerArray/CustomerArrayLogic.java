package epam.courses.module4.simpleClsses.task8.customerArray;

import epam.courses.module4.simpleClsses.task8.customer.Customer;
import epam.courses.module4.simpleClsses.task8.customer.CustomerLogic;

public class CustomerArrayLogic {
    private static CustomerArrayLogic customerArrayLogic;

    private CustomerArrayLogic() {}

    public static CustomerArrayLogic getInstance() {
        if (customerArrayLogic == null) {
            customerArrayLogic = new CustomerArrayLogic();
        }
        return customerArrayLogic;
    }
//доделать
    public void sortCustomersInAlphabeticalOrder(CustomerArray customerArray) {
        Customer[] customers = customerArray.getCustomers();
        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = i + 1; j < customers.length; j++) {
                if ()

            }
        }
    }

    public void printCustomersInCreditCardRange(int left, int right, CustomerArray customers) {
        CustomerLogic cl = CustomerLogic.getInstance();
        for (Customer customer: customers.getCustomers()) {
            if (customer.getCreditCardNumber() >= left
                    && customer.getCreditCardNumber() <= right) {
                cl.printCustomerFullName(customer);
            }
        }
    }
}
