package Beginner.oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        RectangleProcedural rectangle = new RectangleProcedural();

        rectangle.width = 5;
        rectangle.height = 8;
        rectangle.area = rectangle.calculateArea();
        rectangle.perimeter = rectangle.calculatePerimeter();
        rectangle.square = rectangle.isSquare();

        rectangle.printRectangle();

    }
}
