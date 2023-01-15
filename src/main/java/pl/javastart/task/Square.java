package pl.javastart.task;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double calculateSquareArea() {
        return a * a;
    }

    public double calculateSquarePerimeter() {
        return 4 *  a;
    }
}
