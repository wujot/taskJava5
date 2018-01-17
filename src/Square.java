public class Square {
    double sideA;

    Square(double sideA) {
        this.sideA = sideA;
    }

    double squareArea() {
        double squareArea = Math.pow(sideA, 2);
        return squareArea;
    }


}
