import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticOperationsTest {
    @Test
    public void addition_PositiveNumbers_ReturnsCorrectSum() {
        assertEquals(5 + 3, 8);
    }
}
