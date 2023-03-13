package shapes;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    //Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    //Methods
     public String toString() {
        return "Point is at x " + x + " and y " + y;
     }

    public Point addPoint(Point point) {
        double tempX = this.x + point.getX();
        double tempY = this.y + point.getY();
        return new Point(tempX, tempY);
    }

    public Point subPoint(Point point) {
        double tempX = this.x - point.getX();
        double tempY = this.y - point.getY();
        return new Point(tempX, tempY);
    }

    public Point multiplyPoint(double multiplier) {
        double tempX = this.x * multiplier;
        double tempY = this.y * multiplier;
        return new Point(tempX, tempY);
    }

    public Point dividePoint(double divider) {
        double tempX = this.x / divider;
        double tempY = this.y / divider;
        return new Point(tempX, tempY);
    }

    //Get and Set
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}
