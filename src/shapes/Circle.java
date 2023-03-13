package shapes;

public class Circle {

    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcCircleArea(double radius) {
        double area = 2 * radius * Math.PI;
        System.out.println("\nArea of circle is " + area);
        return area;
    }

    public void calcCircleSurface(double radius) {
        double surface = Math.PI * (radius * radius);
        System.out.println("\nSurface of circle is " + surface);
    }
}
