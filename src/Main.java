import shapes.*;

//test comment

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(10, 15);
        Point point2 = new Point(6, 8);
        Point point4 = point1.multiplyPoint(2);
        Point point3 = point1.addPoint(point2);
        System.out.println(point3);
        System.out.println(point4);

        Point newPoint = PointUtils.addPoint(point1, point2);
        System.out.println("New " + newPoint);

        Vector vector1 = new Vector(3, 9, 4);
        System.out.println(vector1);

        Circle circle = new Circle();
        circle.calcCircleArea(4);
        circle.calcCircleSurface(4);

        Triangle triangle = new Triangle(5, 5);
        triangle.calcTriangleArea();

        Rectangle rectangle = new Rectangle(4, 4);
        rectangle.calcRectangleArea();
    }
}