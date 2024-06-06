package basic.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");

        while (true) {
            int num = scanner.nextInt();
            scanner.nextLine();


            if (num == 1) {
                System.out.print("상품명을 입력하세요: ");
                String str = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();
                System.out.print("구매수량을 입력하세요:");
                int count = scanner.nextInt();
                sum += price * count;

                System.out.println("상품명:" + str + " 가격:" + price + " 수량:" + count + " 합계:" + price * count);
            } else if (num == 2) {
                System.out.println("총 비용: " + sum);
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
