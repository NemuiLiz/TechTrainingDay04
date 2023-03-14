import shapes.*;

//test comment

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(10, 15);
        Point point2 = new Point(6, 8);
        Point point4 = point1.multiplyPoint(2);
        Point point3 = point1.addPoint(point2);
        Point point5 = new Point(1, 30);

        System.out.println(point3);
        System.out.println(point4);

        Point newPoint = PointUtils.addPoint(point1, point2);
        System.out.println("New " + newPoint);

        Vector vector1 = new Vector(3, 9, 4);
        System.out.println(vector1);

        Circle circle = new Circle(point5, 20);
        circle.calcArea();
        circle.calcCircumference();

        Triangle triangle = new Triangle(point1, point2, point3);
        triangle.calcArea();

        Rectangle rectangle = new Rectangle(new Point(5, 5), new Point(10, 5), new Point(5, 2), new Point(10,2));
        rectangle.calcArea();
    }
}