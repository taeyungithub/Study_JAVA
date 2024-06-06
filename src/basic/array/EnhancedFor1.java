package basic.array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //향상된 for문, for-each문, 인덱스 필요할 떄는 못씀
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
