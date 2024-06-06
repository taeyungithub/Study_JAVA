package basic.array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();
        int[][] students = new int[count][3];

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            students[i][0] = scanner.nextInt();
            System.out.print("영어 점수:");
            students[i][1] = scanner.nextInt();
            System.out.print("수학 점수:");
            students[i][2] = scanner.nextInt();
        }

        for (int i = 0; i < students.length; i++) {
            int total = 0;
            for (int j = 0; j < students[i].length; j++) {
                total += students[i][j];
            }

            double average = (double) total / students[i].length;

            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
