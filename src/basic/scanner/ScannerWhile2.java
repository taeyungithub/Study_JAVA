package basic.scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두개다 0을 입력하면 종료");
        while (true) {
            System.out.print("첫번째 숫자를 입력하세요:");
            int num1 = scanner.nextInt();
            System.out.print("두번째 숫자를 입력하세요:");
            int num2 = scanner.nextInt();

            if (num1 == 0 & num2 == 0) {
                System.out.println("프로그램 종료");
                break;
            }
            int sum = num1 + num2;
            System.out.println("합:" + sum);
        }
    }
}
