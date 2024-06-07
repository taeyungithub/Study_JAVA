package basic.method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance, 500);
        balance = withdraw(balance, 2000);
        System.out.println(balance);
    }

    public static int deposit(int balance, int i) {
        balance += i;
        return balance;
    }

    public static int withdraw(int balance, int i) {
        if (balance >= i) {
            balance -= i;
            return  balance;
        } else {
            System.out.println("돈이 부족합니다");
            return  balance;
        }
    }
}
