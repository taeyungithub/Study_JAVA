package Beginner.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];
        for (int i = 0; i < productOrders.length; i++) {
            System.out.println((i + 1) + "번쨰 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("상품명: ");
            int price = scanner.nextInt();

            System.out.print("상품명: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(productName, price, quantity);
        }
        printOrders(productOrders);
        getTotalAmount(productOrders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;

        return product;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder p : productOrders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] productOrders) {
        int totalPrice = 0;
        for (ProductOrder p : productOrders) {
            totalPrice += p.price * p.quantity;
        }
        System.out.println("총 결제 금액: " + totalPrice);
    }

}
