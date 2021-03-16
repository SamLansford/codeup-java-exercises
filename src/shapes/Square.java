package shapes;

public class Square extends Rectangle{

    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        return (int) Math.pow(super.length, 2);

    }


    @Override
    public int getPerimeter() {
        return 4 * super.length;
//        return super.width ^ 2;
    }
}
