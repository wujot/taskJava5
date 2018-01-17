public class Rectangle {
    double sideA;
    double sideB;

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double rectPerimeter() {
        double rectPerimeter = 2 * (sideA + sideB);
        return rectPerimeter;
    }
}
