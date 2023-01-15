package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3.5);
        Triangle triangle = new Triangle(9, 5, 5.9);
        Rectangle rectangle = new Rectangle(8, 9.3);

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("Obwód kwadratu = " + shapeCalculator.calculateSquarePerimeter(square));
        System.out.println("Pole kwadratu = " + shapeCalculator.calculateSquareArea(square));
        System.out.println("----------------------------------------");
        System.out.println("Obwód koła = " + shapeCalculator.calculateCirclePerimeter(circle));
        System.out.println("Pole koła = " + shapeCalculator.calculateCircleArea(circle));
        System.out.println("----------------------------------------");
        System.out.println("Obwód trójkąta = " + shapeCalculator.calculateTrianglePerimeter(triangle));
        System.out.println("Pole trójkąta = " + shapeCalculator.calculateTriangleArea(triangle));
        System.out.println("----------------------------------------");
        System.out.println("Obwód prostokąta  = " + shapeCalculator.calculateRectPerimeter(rectangle));
        System.out.println("Pole prostokąta  = " + shapeCalculator.calculateRectArea(rectangle));
    }
}
