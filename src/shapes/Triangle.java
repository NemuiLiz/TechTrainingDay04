package shapes;

import Interface.GeometricShapes;

public class Triangle implements GeometricShapes {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    public double calcArea() {
        double area = pointA.getX() * pointB.getY()
                + pointB.getX() * pointC.getY()
                + pointC.getX() * pointA.getY()
                - (pointA.getY() * pointB.getX()
                + pointB.getY() * pointC.getX()
                + pointC.getY() * pointA.getX());
        return Math.abs(area * 0.5);
    }

    @Override
    public double calcCircumference() {
        double aToB = Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));
        double btoC = Math.sqrt(Math.pow(pointC.getX() - pointB.getX(), 2) + Math.pow(pointC.getY() - pointB.getY(), 2));
        double cToA = Math.sqrt(Math.pow(pointA.getX() - pointC.getX(), 2) + Math.pow(pointA.getY() - pointC.getY(), 2));
        return aToB + btoC + cToA;
    }
}
