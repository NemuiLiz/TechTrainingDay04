package shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle1;
    private Circle circle2;

    @Test
    void calcCircleArea() {
        circle1.calcCircleArea(4);

       // assertEquals(28.27, circle1.area);
    }

    void calcCircleSurface() {
        circle1.calcCircleSurface(5);
    }
}