import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticOperationsTest {
    @Test
    void addition_PositiveNumbers_ReturnsCorrectSum() {
        assertEquals(8, 5 + 3);
    }

    @Test
    void addition_WithZero_ReturnsSameNumber() {
        assertEquals(5, 5 + 0);
        assertEquals(3, 0 + 3);
    }

    @Test
    void subtraction_PositiveNumbers_ReturnsCorrectDifference() {
        assertEquals(2, 5 - 3);
    }

    @Test
    void subtraction_WithZero_ReturnsSameNumber() {
        assertEquals(5, 5 - 0);
        assertEquals(-3, 0 - 3);
    }

    @Test
    void subtraction_NegativeNumbers_ReturnsCorrectResult() {
        assertEquals(-2, -5 - -3);
    }

    @Test
    void multiplication_PositiveNumbers_ReturnsCorrectProduct() {
        assertEquals(15, 5 * 3);
    }

    @Test
    void multiplication_WithZero_ReturnsZero() {
        assertEquals(0, 5 * 0);
        assertEquals(0, 0 * 3);
    }

    @Test
    void multiplication_NegativeNumbers_ReturnsPositiveProduct() {
        assertEquals(15, -5 * -3);
    }

    @Test
    void multiplication_PositiveAndNegative_ReturnsNegativeProduct() {
        assertEquals(-15, 5 * -3);
    }

    @Test
    void division_PositiveNumbers_ReturnsCorrectQuotient() {
        assertEquals(2.0, (double)6 / 3, 0.0001);
    }

    @Test
    void division_WithOne_ReturnsSameNumber() {
        assertEquals(5.0, (double)5 / 1, 0.0001);
    }

    @Test
    void division_NegativeNumbers_ReturnsPositiveResult() {
        assertEquals(2.0, (double)-10 / -5, 0.0001);
    }

    @Test
    void division_ByZero_ThrowsArithmeticException() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 5 / 0;
        });
    }

    @Test
    void boundaryValues_MaxInteger() {
        int max = Integer.MAX_VALUE;
        assertEquals(-2, max + max);
        assertEquals(0, max - max);
        assertEquals(1, max / max);
    }



}
