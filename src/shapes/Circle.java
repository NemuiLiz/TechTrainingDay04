package shapes;



public class Circle extends GeometricShapes {

    Point centerPoint;
    double radius;

    public Circle(Point centerPoint, double radius) {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public double calcCircumference() {
        return 2 * Math.PI * radius;
    }
}
