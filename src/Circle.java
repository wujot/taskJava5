public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double circleArea() {
        double circleArea = Math.PI * Math.pow(radius, 2);
        return circleArea;
    }
}
