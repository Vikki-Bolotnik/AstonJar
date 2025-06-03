import org.example.NumberComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {

  private final NumberComparator comparator = new NumberComparator();

  @Test
  void testCompareEqual() {
    assertEquals(0, comparator.compare(5, 5));
  }

  @Test
  void testCompareLess() {
    assertTrue(comparator.compare(3, 5) < 0);
  }

  @Test
  void testCompareGreater() {
    assertTrue(comparator.compare(10, 5) > 0);
  }
}