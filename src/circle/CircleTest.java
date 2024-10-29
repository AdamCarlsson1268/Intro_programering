package circle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    @DisplayName("areaCircleTest")
    void Area10() {
         Circle circle = new Circle(10);

         assertEquals(314,circle.calculateArea());
    }


    @Test
    @DisplayName("areaCircleTest")
    void Area5() {
        Circle circle = new Circle(7.5);

        assertEquals(176.625,circle.calculateArea());
    }
}
