import Lesson_14.TriangleArea;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

public class TriangleAreaTest {

    @Test
    public void testCalculateAreaWithMinimumPositiveValues() {
        double base = Double.MIN_VALUE;
        double height = Double.MIN_VALUE;
        double expected = 0.5 * base * height;

        double actual = TriangleArea.calculateArea(base, height);
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithZeroBase() {
        TriangleArea.calculateArea(0.0, 4.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithZeroHeight() {
        TriangleArea.calculateArea(6.0, 0.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithNegativeBase() {
        TriangleArea.calculateArea(-3.0, 4.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithNegativeHeight() {
        TriangleArea.calculateArea(5.0, -2.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithBothNegative() {
        TriangleArea.calculateArea(-1.0, -1.0);
    }

    @Test
    public void testExceptionMessage() {
        IllegalArgumentException exception = expectThrows(IllegalArgumentException.class,
                () -> TriangleArea.calculateArea(0.0, 1.0));

        assertEquals(exception.getMessage(), "Основание и высота должны быть положительными");
    }
}