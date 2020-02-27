package epam.courses.module5.basicsOfOOP.task2.product;

public class ProductLogic {
    private static ProductLogic productLogic;

    private ProductLogic() {}

    public static ProductLogic getInstance() {
        if (productLogic == null) {
            productLogic = new ProductLogic();
        }
        return productLogic;
    }

    public void printProduct(Product product) {
        System.out.println("название: " + product.getName());
        System.out.println("цена: " + product.getPrice() + '\n');
    }
}
