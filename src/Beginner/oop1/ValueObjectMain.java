package Beginner.oop1;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add(valueData);
        valueData.add(valueData);
        valueData.add(valueData);
        System.out.println("최종 value = " + valueData.value);
    }
}
