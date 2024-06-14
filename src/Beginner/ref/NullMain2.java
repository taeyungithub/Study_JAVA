package Beginner.ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;
        System.out.println("data = " + data);
    }
}

// NullPointerException   null에 . 을 찍으면 오류 발생
