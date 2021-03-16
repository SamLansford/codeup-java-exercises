package shapes;

public class Rectangle {

    protected int length;

    protected int width;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }


    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }

}
