import org.example.ArithmeticOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticOperationsTest {

  private final ArithmeticOperations operations = new ArithmeticOperations();

  @Test
  public void testAdd() {
    Assert.assertEquals(operations.add(5, 3), 8);
    Assert.assertEquals(operations.add(-2, 2), 0);
  }

  @Test
  public void testSubtract() {
    Assert.assertEquals(operations.subtract(10, 4), 6);
    Assert.assertEquals(operations.subtract(4, 10), -6);
  }

  @Test
  public void testMultiply() {
    Assert.assertEquals(operations.multiply(6, 7), 42);
    Assert.assertEquals(operations.multiply(-3, 4), -12);
  }

  @Test
  public void testDivide() {
    Assert.assertEquals(operations.divide(10, 2), 5.0);
    Assert.assertEquals(operations.divide(-9, 3), -3.0);
  }

  @Test(expectedExceptions = ArithmeticException.class)
  public void testDivideByZero() {
    operations.divide(5, 0);
  }
}