import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testSub {
    @Test
    public void testSub() {
        assertEquals(5, sub.sub(10, 5));
        assertEquals(0, sub.sub(3, 3));
        assertEquals(-10, sub.sub(-5, 5));
    }
}