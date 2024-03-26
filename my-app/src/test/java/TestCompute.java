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

  @Test
  public void testCountNumberOfOccurrencesWithElementInQueue() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(3);
    when(mq.contains("eleman1")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("eleman1");
    when(mq.getAt(1)).thenReturn("eleman2");
    when(mq.getAt(2)).thenReturn("eleman1");
    c = new Compute(mq);

    assertEquals(2, c.countNumberOfOccurrences("eleman1"));
  }
}