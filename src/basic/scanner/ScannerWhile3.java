package basic.scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("정수입력(0은 종료):");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("정수합:" + sum);
    }
}
