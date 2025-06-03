import org.example.FactorialCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

  private final FactorialCalculator calculator = new FactorialCalculator();

  @Test
  void testFactorialPositiveNumber() {
    assertEquals(1, calculator.factorial(0));
    assertEquals(1, calculator.factorial(1));
    assertEquals(2, calculator.factorial(2));
    assertEquals(6, calculator.factorial(3));
    assertEquals(24, calculator.factorial(4));
    assertEquals(120, calculator.factorial(5));
  }

  @Test
  void testFactorialLargeNumber() {
    assertEquals(3628800, calculator.factorial(10));
  }

  @Test
  void testFactorialNegativeNumber() {
    assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
  }
}