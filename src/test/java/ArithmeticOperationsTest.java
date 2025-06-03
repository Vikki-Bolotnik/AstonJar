import org.example.ArithmeticOperations;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {

  private final ArithmeticOperations ops = new ArithmeticOperations();

  @Test
  void testAdd() {
    assertEquals(5, ops.add(2, 3));
    assertEquals(-1, ops.add(-2, 1));
    assertEquals(0, ops.add(0, 0));
  }

  @Test
  void testSubtract() {
    assertEquals(-1, ops.subtract(2, 3));
    assertEquals(-3, ops.subtract(-2, 1));
    assertEquals(0, ops.subtract(0, 0));
  }

  @Test
  void testMultiply() {
    assertEquals(6, ops.multiply(2, 3));
    assertEquals(-2, ops.multiply(-2, 1));
    assertEquals(0, ops.multiply(0, 5));
  }

  @Test
  void testDivide() {
    assertEquals(2.0, ops.divide(4, 2));
    assertEquals(-2.0, ops.divide(-4, 2));
    assertEquals(0.5, ops.divide(1, 2));
  }

  @Test
  void testDivideByZero() {
    assertThrows(ArithmeticException.class, () -> ops.divide(5, 0));
  }
}