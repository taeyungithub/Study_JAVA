package Beginner.oop1.ex;

public class RectangleProcedural {
    int width;
    int height;
    int area;
    int perimeter;
    boolean square;



    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return (width + height) * 2;
    }

    boolean isSquare() {
        return width == height;
    }

    void printRectangle() {
        System.out.println("넓이: " + area);
        System.out.println("둘레: " + perimeter);
        System.out.println("정사각형 여부: " + square);
    }
}

