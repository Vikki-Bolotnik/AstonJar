import org.example.TriangleAreaCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaCalculatorTest {

  private final TriangleAreaCalculator calculator = new TriangleAreaCalculator();

  @Test
  void testCalculateAreaPositiveValues() {
    assertEquals(50.0, calculator.calculateArea(10, 10));
    assertEquals(25.0, calculator.calculateArea(10, 5));
    assertEquals(0.0, calculator.calculateArea(0, 10));
  }

  @Test
  void testCalculateAreaZeroValues() {
    assertEquals(0.0, calculator.calculateArea(0, 0));
  }

  @Test
  void testCalculateAreaNegativeValues() {
    assertThrows(IllegalArgumentException.class, () -> calculator.calculateArea(-10, 10));
    assertThrows(IllegalArgumentException.class, () -> calculator.calculateArea(10, -10));
  }

//  @Test
//  void testCalculateAreaNegativeValues2() {
//    try {
//      calculator.calculateArea(-10, 10);
//      fail("Expected IllegalArgumentException for negative width");
//    } catch (IllegalArgumentException e) {
//    }
//
//    try {
//      calculator.calculateArea(10, -10);
//      fail("Expected IllegalArgumentException for negative height");
//    } catch (IllegalArgumentException e) {
//    }
//  }
}