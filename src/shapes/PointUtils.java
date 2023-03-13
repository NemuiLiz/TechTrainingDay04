package shapes;

public class PointUtils {

    public static Point addPoint(Point pointOne, Point pointTwo) {
        double tempX = pointOne.getX() + pointTwo.getX();
        double tempY = pointOne.getY() + pointTwo.getY();
        return new Point(tempX, tempY);
    }


}


