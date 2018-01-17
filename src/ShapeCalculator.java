public class ShapeCalculator {

    double squareArea(Square square) {
        double squareArea = Math.pow(square.sideA, 2);
        return squareArea;
    }

    double circleArea(Circle circle) {
        double circleArea = Math.PI * Math.pow(circle.radius, 2);
        return circleArea;
    }

    double triangleParimeter(Triangle triangle) {
        double trianglePerimeter = triangle.sideA + triangle.sideB + triangle.sideC;
        return trianglePerimeter;
    }

    double rectPerimeter(Rectangle rectangle) {
        double rectPerimeter = 2 * (rectangle.sideA + rectangle.sideB);
        return rectPerimeter;
    }
}
