package shapes;

public class Triangle {

    double width;
    double height;

    public Triangle() {
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calcTriangleArea() {
        double triangleArea = (width * height) /2;
        System.out.println("\nArea of triangle is " + triangleArea);
    }

    public void calcTriangleSurface() {
        double triangleSurface = 1/2 * width * height;
        System.out.println("\nSurface of triangle is " + triangleSurface);
    }
}
