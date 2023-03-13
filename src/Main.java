import shapes.Point;


public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(10, 15);
        Point point2 = new Point(6, 8);
        Point point4 = point1.multiplyPoint(2);
        Point point3 = point1.addPoint(point2);
        System.out.println(point3);
        System.out.println(point4);

    }
}