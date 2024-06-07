package basic.method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);

    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("미성년자");
            return;
        }
        System.out.println("성인");

    }

}
