package basic.casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long maxIntOver = 2147483648L; //최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println(intValue);

        intValue = (int) maxIntOver;
        System.out.println(intValue);
        //오버플로우
    }
}
