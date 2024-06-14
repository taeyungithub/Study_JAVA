package Beginner.ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data a = new Data();
        a.value = 10;
        System.out.println("메서드 호출전: a = " + a.value);
        changePrimitive(a);
        System.out.println("메서드 호출후: a = " + a.value);

    }

    static void changePrimitive(Data x) {
        x.value = 20;

    }
}
