package pl.javastart.task;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateCircleArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCirclePerimeter() {
        return 2 * Math.PI * radius;
    }
}
