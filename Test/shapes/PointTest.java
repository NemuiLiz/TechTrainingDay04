package shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class PointTest {

    private static final double DELTA = 0.001;
    private Point point1;
    private Point point2;

    @BeforeEach
    public void initPoints() {
        point1 = new Point(10,15);
        point2 = new Point(6,8);
    }

    @Test
    void addPoint() {
        Point testPoint3 = point1.addPoint(point2);

        assertEquals(16, testPoint3.x, DELTA);
        assertEquals(23, testPoint3.y, DELTA);
    }


    @Test
    void subPoint() {
        Point testPoint3 = point1.subPoint(point2);

        assertEquals(4, testPoint3.x, DELTA);
        assertEquals(7, testPoint3.y, DELTA);
    }

    @Test
    void multiplyPoint() {
        Point testPoint3 = point1.multiplyPoint(2);

        assertEquals(20, testPoint3.x, DELTA);
        assertEquals(12, testPoint3.y, DELTA);
    }

    @Test
    void dividePoint() {
        Point testPoint3 = point1.multiplyPoint(2);

        assertEquals(5, testPoint3.x, DELTA);
        assertEquals(3, testPoint3.y, DELTA);
    }
}