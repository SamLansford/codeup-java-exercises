package shapes;


public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

//        Quadrilateral myShape;
//
//        myShape = new Rectangle(5, 10);
//        System.out.printf("Rectangle Area: %s\n", myShape.getArea());
//        System.out.printf("Rectangle Perimeter: %s\n", myShape.getPerimeter());
//
//        myShape.setWidth(10);
//        myShape.setLength(10);
//
//        System.out.printf("Rectangle Area 2: %s\n", myShape.getArea());
//        System.out.printf("Rectangle Perimeter 2: %s\n", myShape.getPerimeter());
//
//
//        myShape = new Square(4);
//        System.out.printf("Square Area: %s\n", myShape.getArea());
//        System.out.printf("Square Perimeter: %s\n", myShape.getPerimeter());
//
//        myShape.setLength(5);
//        System.out.printf("Square Area 2: %s\n", myShape.getArea());
//        System.out.printf("Square Perimeter 2: %s\n", myShape.getPerimeter());

    }
}