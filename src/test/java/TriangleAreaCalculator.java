import org.example.TriangleAreaCalculator;

public class TriangleAreaCalculatorTest {

  private final TriangleAreaCalculator calculator = new TriangleAreaCalculator();

  @DataProvider(name = "areaData")
  public Object[][] createData() {
    return new Object[][]{
        {10.0, 5.0, 25.0},
        {0.0, 10.0, 0.0},
        {7.5, 3.0, 11.25}
    };
  }

  @Test(dataProvider = "areaData")
  public void testCalculateArea(double base, double height, double expected) {
    Assert.assertEquals(calculator.calculateArea(base, height), expected, 1e-9);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCalculateAreaNegativeBase() {
    calculator.calculateArea(-5, 10);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCalculateAreaNegativeHeight() {
    calculator.calculateArea(5, -10);
  }
}