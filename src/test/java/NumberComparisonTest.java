import Lesson_14.NumberComparison;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberComparisonTest {

    @Test
    public void compare_FirstGreaterThanSecond_ReturnsGreaterSymbol() {
        String result = NumberComparison.compare(10, 5);
        assertEquals(result, "10 > 5");
    }

    @Test
    public void compare_SecondGreaterThanFirst_ReturnsLessSymbol() {
        String result = NumberComparison.compare(3, 7);
        assertEquals(result, "3 < 7");
    }

    @Test
    public void compare_EqualNumbers_ReturnsEqualSymbol() {
        String result = NumberComparison.compare(4, 4);
        assertEquals(result, "4 = 4");
    }

    @Test
    public void compare_NegativeNumbers_FirstGreater() {
        String result = NumberComparison.compare(-2, -5);
        assertEquals(result, "-2 > -5");
    }

    @Test
    public void compare_NegativeNumbers_SecondGreater() {
        String result = NumberComparison.compare(-8, -3);
        assertEquals(result, "-8 < -3");
    }

    @Test
    public void compare_ZeroAndPositive() {
        String result = NumberComparison.compare(0, 10);
        assertEquals(result, "0 < 10");
    }

    @Test
    public void compare_ZeroAndNegative() {
        String result = NumberComparison.compare(0, -5);
        assertEquals(result, "0 > -5");
    }

    @Test
    public void compare_BothZeros() {
        String result = NumberComparison.compare(0, 0);
        assertEquals(result, "0 = 0");
    }

    @Test
    public void compare_MaxIntegerAndMinInteger() {
        String result = NumberComparison.compare(Integer.MAX_VALUE, Integer.MIN_VALUE);
        assertEquals(result, Integer.MAX_VALUE + " > " + Integer.MIN_VALUE);
    }

    @Test
    public void compare_MinIntegerAndMaxInteger() {
        String result = NumberComparison.compare(Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertEquals(result, Integer.MIN_VALUE + " < " + Integer.MAX_VALUE);
    }

    @Test
    public void compare_LargePositiveNumbers() {
        String result = NumberComparison.compare(999999, 1000000);
        assertEquals(result, "999999 < 1000000");
    }

    @Test
    public void compare_LargeNegativeNumbers() {
        String result = NumberComparison.compare(-1000000, -999999);
        assertEquals(result, "-1000000 < -999999");
    }
}