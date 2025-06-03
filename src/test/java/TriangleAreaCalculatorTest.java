import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.example.TriangleAreaCalculator;
import org.testng.annotations.Test;

public class TriangleAreaCalculatorTest {

  @Test
  public void testRightTriangle() {
    double result = TriangleAreaCalculator.triangleAreaCalculator(3, 4, 5);
    assertEquals(result, 6.0, "Площадь прямоугольного треугольника 3-4-5 должна быть 6");
  }

  @Test
  public void testEquilateralTriangle() {
    double result = TriangleAreaCalculator.triangleAreaCalculator(5, 5, 5);
    assertEquals(Math.round(result), 11, "Площадь равностороннего треугольника со стороной 5");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNegativeSide() {
    TriangleAreaCalculator.triangleAreaCalculator(-2, 3, 4);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInvalidTriangle() {
    TriangleAreaCalculator.triangleAreaCalculator(1, 2, 5);
  }

  @Test
  public void testSimpleTriangle() {
    double result = TriangleAreaCalculator.triangleAreaCalculator(7, 8, 9);
    assertTrue(result > 26 && result < 27, "Площадь треугольника 7-8-9 должна быть ~26.83");
  }
}