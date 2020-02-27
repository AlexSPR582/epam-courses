package epam.courses.module5.basicsOfOOP.task2.main;

/*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров. */

import epam.courses.module5.basicsOfOOP.task2.payment.BasketLogic;
import epam.courses.module5.basicsOfOOP.task2.payment.Payment;
import epam.courses.module5.basicsOfOOP.task2.product.Product;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(200);
        Product product1 = new Product("хлеб", 15);
        Product product2 = new Product("виноград", 50);
        Product product3 = new Product("апельсины", 30);
        Product product4 = new Product("конфеты", 15);
        payment.getBasket().addProduct(product1, product2, product3, product4);

        System.out.println("ТОВАРЫ В КОРЗИНЕ:");
        BasketLogic.getInstance().printProducts(payment.getBasket());

        payment.getBasket().deleteProduct(product3);
        System.out.println("ТОВАРЫ В КОРЗИНЕ ПОСЛЕ УДАЛЕНИЯ ТОВАРА:");
        BasketLogic.getInstance().printProducts(payment.getBasket());

        payment.pay();
        System.out.println("ОСТАЛОСЬ ДЕНЕГ ПОСЛЕ ПОКУПКИ: " + payment.getMoney());
    }
}
