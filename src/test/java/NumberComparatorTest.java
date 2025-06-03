import org.example.NumberComparator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberComparatorTest {

  private final NumberComparator comparator = new NumberComparator();

  @DataProvider(name = "compareData")
  public Object[][] createData() {
    return new Object[][]{
        {5, 10, -1},
        {10, 5, 1},
        {7, 7, 0}
    };
  }

  @Test(dataProvider = "compareData")
  public void testCompare(int a, int b, int expected) {
    Assert.assertEquals(comparator.compare(a, b), expected);
  }
}