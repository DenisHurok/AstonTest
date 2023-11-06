package Shapes;

class Triangle implements Shape {
    private double a;
    private double b;
    private double c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
