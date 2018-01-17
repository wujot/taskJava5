public class ShapeCalculatorTest {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        // calculate square area
        Square square = new Square(5);
        double squareArea = shapeCalculator.squareArea(square);

        // calculate circle area
        Circle circle = new Circle(4);
        double circleArea = shapeCalculator.circleArea(circle);

        // calculate triangle perimeter
        Triangle triangle = new Triangle(2,3,4);
        double trianglePerimeter = shapeCalculator.triangleParimeter(triangle);

        // calculate rectangle perimeter
        Rectangle rectangle = new Rectangle(2,3);
        double rectPerimeter = shapeCalculator.rectPerimeter(rectangle);

        // print the results of calculations
        System.out.println("Results from the first part of the task:");
        System.out.println("Area of the square is: " + squareArea);
        System.out.println("Area of the circle is: " + circleArea);
        System.out.println("Perimeter of the triangle is: " + trianglePerimeter);
        System.out.println("Perimeter of the rectangle is: " + rectPerimeter);
        System.out.println("-------------------------------------------------------");

        // second part of the task - basically is the same calculation as above but done in other fashion
        System.out.println("Results from the second part of the task:");

        // square area - calculate then print the result
        Square square2 = new Square(5);
        double squareArea2 = square.squareArea();
        System.out.print("Area of the square is: ");
        System.out.println(squareArea2);

        // circle area - calculate then print the result
        Circle circle2 = new Circle(4);
        double circleArea2 = circle.circleArea();
        System.out.print("Area of the circle is: ");
        System.out.println(circleArea2);

        // triangle perimeter - calculate then print the result
        Triangle triangle2 = new Triangle(2,3,4);
        double trianglePerimeter2 = triangle.trianglePerimeter();
        System.out.print("Perimeter of the triangle is: ");
        System.out.println(trianglePerimeter2);

        // rectangle perimeter - calculate then print the result
        Rectangle rectangle2 = new Rectangle(2,3);
        double rectanglePerimeter2 = rectangle.rectPerimeter();
        System.out.print("Perimeter of the rectangle is: ");
        System.out.println(rectanglePerimeter2);
    }
}
