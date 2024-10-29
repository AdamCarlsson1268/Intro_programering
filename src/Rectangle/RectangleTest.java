package Rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void area() {
        Rectangle rectangle = new Rectangle(5, 6);
        assertEquals(30, rectangle.calculateArea());


    }

    @Test
    void perimeter() {
        Rectangle rectangle = new Rectangle(5, 7);
        assertEquals(24, rectangle.calculatePerimeter());
    }

    @Test
    void isSquare() {
        Rectangle rectangle = new Rectangle(5, 5);
        assertEquals(true, rectangle.isSquare());
    }

    @Test
    void isNotSquare(){
        Rectangle rectangle = new Rectangle(6,3);
        assertNotEquals(false,rectangle.isNotSquare());
    }
}
