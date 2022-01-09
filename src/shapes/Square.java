package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return Math.pow(super.length, 2);
    }

    public double getPerimeter() {
        return super.width * 4;
    }

    public void setLength(double side) {
        super.length = side;
        super.width = side;
    }

    public void setWidth(double side) {
        super.width = side;
        super.length = side;
    }
}
