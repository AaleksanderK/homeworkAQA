import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    public void addition_PositiveNumbers_ReturnsCorrectSum() {
        assertEquals(5 + 3, 8);
    }

    @Test
    public void addition_WithZero_ReturnsSameNumber() {
        assertEquals(5 + 0, 5);
        assertEquals(0 + 3, 3);
    }

    @Test
    public void subtraction_PositiveNumbers_ReturnsCorrectDifference() {
        assertEquals(5 - 3, 2);
    }

    @Test
    public void subtraction_WithZero_ReturnsSameNumber() {
        assertEquals(5 - 0, 5);
        assertEquals(0 - 3, -3);
    }

    @Test
    public void subtraction_NegativeNumbers_ReturnsCorrectResult() {
        assertEquals(-5 - -3, -2);
    }

    @Test
    public void multiplication_PositiveNumbers_ReturnsCorrectProduct() {
        assertEquals(5 * 3, 15);
    }

    @Test
    public void multiplication_WithZero_ReturnsZero() {
        assertEquals(5 * 0, 0);
        assertEquals(0 * 3, 0);
    }

    @Test
    public void multiplication_NegativeNumbers_ReturnsPositiveProduct() {
        assertEquals(-5 * -3, 15);
    }

    @Test
    public void multiplication_PositiveAndNegative_ReturnsNegativeProduct() {
        assertEquals(5 * -3, -15);
    }

    @Test
    public void division_PositiveNumbers_ReturnsCorrectQuotient() {
        assertEquals((double) 6 / 3, 2.0, 0.0001);
    }

    @Test
    public void division_WithOne_ReturnsSameNumber() {
        assertEquals((double) 5 / 1, 5.0, 0.0001);
    }

    @Test
    public void division_NegativeNumbers_ReturnsPositiveResult() {
        assertEquals((double) -10 / -5, 2.0, 0.0001);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void division_ByZero_ThrowsArithmeticException() {
        int result = 5 / 0;
    }

    @Test
    public void boundaryValues_MaxInteger() {
        int max = Integer.MAX_VALUE;
        assertEquals(max + max, -2);
        assertEquals(max - max, 0);
        assertEquals(max / max, 1);
    }
}
