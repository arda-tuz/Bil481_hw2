import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void oneElementTest() {
    assertFalse(c.compute(1));
  }

  @Test
  public void EvenNumberElementsTest() {
    assertFalse(c.compute(1, 2));
  }

  @Test(expected = RuntimeException.class)
  public void exceptionTest() {
    c.compute(1, 2, 0);
  }

  @Test
  public void SumDivisibleByElementTest() {
    assertTrue(c.compute(2, 4, 6, 8, 10));
  }

  @Test
  public void SumNotDivisibleByElementTest() {
    assertFalse(c.compute(2, 2, 2, 2, 3));
  }

}