package Beginner.pack.com.helloshop.order;

import Beginner.pack.com.helloshop.user.User;
import Beginner.pack.com.helloshop.product.Product;

public class OrderService {
    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
