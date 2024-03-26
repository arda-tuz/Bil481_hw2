import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }

  @Test
  public void testCountNumberOfOccurrencesWithEmptyQueue() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    c = new Compute(mq);

    assertEquals(-1, c.countNumberOfOccurrences("Bil_481"));
  }

  @Test
  public void testCountNumberOfOccurrencesWithElementNotInQueue() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains("Bil_481")).thenReturn(false);
    c = new Compute(mq);

    assertEquals(0, c.countNumberOfOccurrences("Bil_481"));
  }
}