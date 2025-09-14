import static org.junit.Assert.*;
import org.junit.Test;

public class testAdd {
    @Test
    public void testAddition() {
        assertEquals(5, Add.add(2, 3));
        assertEquals(-1, Add.add(2, -3));
        assertEquals(0, Add.add(0, 0));
        assertEquals(-5, Add.add(-2, -3));
    }
}
