package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter the radius of a circle");
        double radius = input.getDouble();
        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(2,5);
        System.out.println(rectangle);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
