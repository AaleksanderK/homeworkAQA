import Lesson_14.NumberComparison;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComparisonTest {

    @Test
    void compare_FirstGreaterThanSecond_ReturnsGreaterSymbol() {
        String result = NumberComparison.compare(10, 5);
        assertEquals("10 > 5", result);
    }

    @Test
    void compare_SecondGreaterThanFirst_ReturnsLessSymbol() {
        String result = NumberComparison.compare(3, 7);
        assertEquals("3 < 7", result);
    }

    @Test
    void compare_EqualNumbers_ReturnsEqualSymbol() {
        String result = NumberComparison.compare(4, 4);
        assertEquals("4 = 4", result);
    }

    @Test
    void compare_NegativeNumbers_FirstGreater() {
        String result = NumberComparison.compare(-2, -5);
        assertEquals("-2 > -5", result);
    }

    @Test
    void compare_NegativeNumbers_SecondGreater() {
        String result = NumberComparison.compare(-8, -3);
        assertEquals("-8 < -3", result);
    }

    @Test
    void compare_ZeroAndPositive() {
        String result = NumberComparison.compare(0, 10);
        assertEquals("0 < 10", result);
    }

    @Test
    void compare_ZeroAndNegative() {
        String result = NumberComparison.compare(0, -5);
        assertEquals("0 > -5", result);
    }

    @Test
    void compare_BothZeros() {
        String result = NumberComparison.compare(0, 0);
        assertEquals("0 = 0", result);
    }

    @Test
    void compare_MaxIntegerAndMinInteger() {
        String result = NumberComparison.compare(Integer.MAX_VALUE, Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE + " > " + Integer.MIN_VALUE, result);
    }

    @Test
    void compare_MinIntegerAndMaxInteger() {
        String result = NumberComparison.compare(Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MIN_VALUE + " < " + Integer.MAX_VALUE, result);
    }

    @Test
    void compare_LargePositiveNumbers() {
        String result = NumberComparison.compare(999999, 1000000);
        assertEquals("999999 < 1000000", result);
    }

    @Test
    void compare_LargeNegativeNumbers() {
        String result = NumberComparison.compare(-1000000, -999999);
        assertEquals("-1000000 < -999999", result);
    }
}
