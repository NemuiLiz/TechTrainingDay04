package shapes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

   private Circle circle;
   private final double DELTA = 0.01;

   @BeforeEach
   void initCircle() {
      circle = new Circle(new Point(5, 5), 5);
   }

    @Test
    void calcArea() {
       assertEquals(78.54, circle.calcArea(), DELTA);
    }

    @Test
    void calcCircumference() {
       assertEquals(31.4159, circle.calcCircumference(), DELTA);
    }
}