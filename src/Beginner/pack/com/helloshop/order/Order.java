package Beginner.pack.com.helloshop.order;

import Beginner.pack.com.helloshop.product.Product;
import Beginner.pack.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
