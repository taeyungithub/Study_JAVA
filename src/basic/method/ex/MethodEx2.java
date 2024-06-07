package basic.method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";
        print(message,1);
        print(message,3);
        print(message,5);
    }

    public static void print(String s,int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(s);
        }
    }
}
