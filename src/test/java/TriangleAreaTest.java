//import Lesson_14.TriangleArea;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class TriangleAreaTest {
//    @Test
//    void testCalculateAreaWithMinimumPositiveValues() {
//        double base = Double.MIN_VALUE;
//        double height = Double.MIN_VALUE;
//        double expected = 0.5 * base * height;
//
//        double actual = TriangleArea.calculateArea(base, height);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void testCalculateAreaWithZeroBase() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            TriangleArea.calculateArea(0.0, 4.0);
//        });
//    }
//
//    @Test
//    void testCalculateAreaWithZeroHeight() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            TriangleArea.calculateArea(6.0, 0.0);
//        });
//    }
//
//    @Test
//    void testCalculateAreaWithNegativeBase() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            TriangleArea.calculateArea(-3.0, 4.0);
//        });
//    }
//
//    @Test
//    void testCalculateAreaWithNegativeHeight() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            TriangleArea.calculateArea(5.0, -2.0);
//        });
//    }
//
//    @Test
//    void testCalculateAreaWithBothNegative() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            TriangleArea.calculateArea(-1.0, -1.0);
//        });
//    }
//
//    @Test
//    void testExceptionMessage() {
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//            TriangleArea.calculateArea(0.0, 1.0);
//        });
//
//        assertEquals("Основание и высота должны быть положительными", exception.getMessage());
//    }
//}
