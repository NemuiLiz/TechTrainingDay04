package shapes;


public class Rectangle extends GeometricShapes {

    Point topLeft, topRight, bottomLeft, bottomRight;

    public Rectangle(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public double calcArea() {
        double tempHeight = Math.abs(bottomLeft.getY() - topLeft.getY());
        double tempWidth = Math.abs(topRight.getX() - topLeft.getX());
        return tempWidth * tempHeight;
    }

    public double calcCircumference() {
        double tempHeight = Math.abs(bottomLeft.getY() - topLeft.getY());
        double tempWidth = Math.abs(topRight.getX() - topLeft.getX());
        return 2 * tempWidth + 2 * tempHeight;
    }
}
