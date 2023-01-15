package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(3.5);
        Triangle triangle = new Triangle(9, 5, 5.9);
        Rectangle rectangle = new Rectangle(8, 9.3);

        double squarePerimeter = square.calculateSquarePerimeter();
        double squareArea = square.calculateSquareArea();
        double circlePerimeter = circle.calculateCirclePerimeter();
        double circleArea = circle.calculateCircleArea();
        double trianglePerimeter = triangle.calculateTrianglePerimeter();
        double triangleArea = triangle.calculateTriangleArea();
        double rectPerimeter = rectangle.calculateRectPerimeter();
        double rectArea = rectangle.calculateRectArea();

        System.out.println("Obwód kwadratu = " + squarePerimeter);
        System.out.println("Pole kwadratu = " + squareArea);
        System.out.println("----------------------------------------");
        System.out.println("Obwód koła = " + circlePerimeter);
        System.out.println("Pole koła = " + circleArea);
        System.out.println("----------------------------------------");
        System.out.println("Obwód trójkąta = " + trianglePerimeter);
        System.out.println("Pole trójkąta = " + triangleArea);
        System.out.println("----------------------------------------");
        System.out.println("Obwód prostokąta  = " + rectPerimeter);
        System.out.println("Pole prostokąta  = " + rectArea);
    }
}
