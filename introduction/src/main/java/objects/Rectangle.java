package objects;

public class Rectangle {
    private double width;
    private double height;
    private int sides = 4;

    // Default constructor. When no defined, there's default constructor with empty body provided.
    public Rectangle() {
        setHeight(0);
        setWidth(0);
    }

    // "all-arg" constructor
    public Rectangle(double width, double height) {
        setHeight(height);
        setWidth(width);
    }

    public double calculatePerimeter(double width, double height) {
        return (2 * width) * (2 * height);
    }

    public double calculateArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
