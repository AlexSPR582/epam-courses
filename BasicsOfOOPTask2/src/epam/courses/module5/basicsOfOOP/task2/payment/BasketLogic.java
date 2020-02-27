package epam.courses.module5.basicsOfOOP.task2.payment;

import epam.courses.module5.basicsOfOOP.task2.product.Product;
import epam.courses.module5.basicsOfOOP.task2.product.ProductLogic;

public class BasketLogic {
    private static BasketLogic basketLogic;

    private BasketLogic() {}

    public static BasketLogic getInstance() {
        if (basketLogic == null) {
            basketLogic = new BasketLogic();
        }
        return basketLogic;
    }

    public void printProducts(Payment.Basket basket) {
        for (Product product: basket.getProducts()) {
            ProductLogic.getInstance().printProduct(product);
        }
    }
}
