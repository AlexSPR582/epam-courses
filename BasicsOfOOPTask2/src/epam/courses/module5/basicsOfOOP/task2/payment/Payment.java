package epam.courses.module5.basicsOfOOP.task2.payment;

import epam.courses.module5.basicsOfOOP.task2.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private int productsPrice = 0;
    private int money;
    private Basket basket;

    public Payment(int money){
        this.money = money;
        basket = new Basket();
    }

    public class Basket{
        private List<Product> products = new ArrayList<>();

        public void addProduct(Product... products){
            for (Product product: products){
                this.products.add(product);
                productsPrice += product.getPrice();
            }
        }

        public void deleteProduct(Product product){
            products.remove(product);
            productsPrice -= product.getPrice();
        }

        public void clearBasket(){
            this.products.clear();
            productsPrice = 0;
        }

        public List<Product> getProducts() {
            return products;
        }
    }

    public void pay(){
        if (money - productsPrice >= 0){
            money -= productsPrice;
            productsPrice = 0;
            basket.clearBasket();
            System.out.println("Оплата проведена успешно");
        }
        else {
            System.out.println("У вас недостаточно средств");
        }
    }


    public int getProductsPrice(){
        return this.productsPrice;
    }

    public int getMoney(){
        return this.money;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public Basket getBasket() {
        return basket;
    }
}
