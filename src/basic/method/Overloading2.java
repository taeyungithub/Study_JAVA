package basic.method;

public class Overloading2 {
    public static void main(String[] args) {
        add(1.1,2);
        add(1.1, 2);
    }

    public static void add(int a, double b) {
        System.out.println("1번");

    }

    public static void add(double a, int b) {
        System.out.println("2번");

    }
}
