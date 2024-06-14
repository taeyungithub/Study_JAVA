package Beginner.ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("A 참조값 = " + dataA);
        System.out.println("B 참조값 = " + dataB);
        System.out.println("A value = " + dataA.value);
        System.out.println("B value = " + dataB.value);

        dataB.value = 30;
        System.out.println("A value = " + dataA.value);
        System.out.println("B value = " + dataB.value);
    }
}
