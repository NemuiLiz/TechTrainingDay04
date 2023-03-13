package shapes;

public class Rectangle {

    double width;
    double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calcRectangleArea() {
        double rectangleArea = width + height + width + height;
        System.out.println("\nArea of rectangle is " + rectangleArea);
    }

    public void calcRectangleSurface() {
        double rectangleSurface = width * height;
        System.out.println("\nSurface of rectangle is " + rectangleSurface);
    }
}
