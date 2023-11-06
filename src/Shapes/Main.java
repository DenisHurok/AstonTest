package Shapes;

public class Main {
    public static void main(String[] args) {
        String colorBorder = "Красный";
        String colorFilling = "Синий";
        Rectangle rectangle = new Rectangle(10, 15, colorFilling, colorFilling);
        Circle circle = new Circle(5, colorFilling, colorFilling);
        Triangle triangle = new Triangle(5, 6, 8, colorBorder, colorFilling);
        circle.printShapeDetails();
        rectangle.printShapeDetails();
        triangle.printShapeDetails();

    }
}
