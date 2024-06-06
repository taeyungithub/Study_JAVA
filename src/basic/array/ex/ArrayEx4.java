package basic.array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = scanner.nextInt();
        }
        int total = 0;
        for (int i : numbers) {
            total += i;
        }
        double average = (double) total / numbers.length;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + average);

    }
}
