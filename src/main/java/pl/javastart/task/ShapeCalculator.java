package pl.javastart.task;

public class ShapeCalculator {

    double calculateSquareArea(Square square) {
        return square.getA() * square.getA();
    }

    double calculateSquarePerimeter(Square square) {
        return 4 *  square.getA();
    }

    double calculateCircleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    double calculateCirclePerimeter(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    double calculateTriangleArea(Triangle triangle) {
        double p = (triangle.getA() + triangle.getB() + triangle.getC()) / 2;
        return Math.sqrt(p * (p - triangle.getA()) * (p - triangle.getB()) * (p - triangle.getC()));
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

    double calculateRectArea(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return (2 * rectangle.getA()) + (2 * rectangle.getB());
    }
}
