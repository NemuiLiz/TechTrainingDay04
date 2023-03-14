package shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private final double DELTA = 0.01;
    private Triangle triangle;

    @BeforeEach
    void initTriangle() {
        triangle = new Triangle(new Point(5, 5), new Point(10, 5), new Point(7.5, 9));
    }

    @Test
    void calcArea() {
        assertEquals(10, triangle.calcArea(), DELTA);
    }

    @Test
    void calcCircumference() {
        assertEquals(14.434, triangle.calcCircumference(), DELTA);
    }
}