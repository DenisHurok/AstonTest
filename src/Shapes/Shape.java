package Shapes;

public interface Shape {
    double getPerimeter();

    double getArea();

    String getFillColor();

    String getBorderColor();

    default void printShapeDetails() {
        System.out.println("Perimeter: " + getPerimeter() + ", Area: " + getArea() + ", Fill Color: " + getFillColor() + ", Border Color: " + getBorderColor());
    }
}