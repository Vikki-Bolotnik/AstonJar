package org.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

  private final FactorialCalculator calculator = new FactorialCalculator();

  @DataProvider(name = "factorialData")
  public Object[][] createData() {
    return new Object[][]{
        {0, 1},
        {1, 1},
        {2, 2},
        {5, 120},
        {10, 3628800}
    };
  }

  @Test(dataProvider = "factorialData")
  public void testFactorial(int input, long expected) {
    Assert.assertEquals(calculator.factorial(input), expected);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFactorialNegative() {
    calculator.factorial(-1);
  }
}