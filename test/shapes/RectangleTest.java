package shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private final double DELTA = 0.01;
    private Rectangle rectangle;

    @BeforeEach
    void initRectangle() {
        rectangle = new Rectangle(new Point(5, 5), new Point(10, 5), new Point(5, 2), new Point(10,2));
    }

    @Test
    void calcArea() {
        assertEquals(15, rectangle.calcArea(), DELTA);
    }

    @Test
    void calcCircumference() {
        assertEquals(16, rectangle.calcCircumference(), DELTA);
    }
}