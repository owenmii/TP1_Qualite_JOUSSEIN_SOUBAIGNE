import static org.junit.Assert.*;
import org.junit.Test;

public class testAdd {
    @Test
    public void testAddition() {
        assertEquals(10, add.add(5, 5));
        assertEquals(-1, add.add(2, -3));
        assertEquals(0, add.add(0, 0));
        assertEquals(-5, add.add(-2, -3));
    }
}
