import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.Main;

public class MainTest {

    @Test
    public void testSumNegative() {
        assertEquals(0, Main.sum(-1));
    }

    @Test
    public void testSumZero() {
        assertEquals(0, Main.sum(0));
    }

    @Test
    public void testSumOne() {
        assertEquals(1, Main.sum(1));
    }

    @Test
    public void testSumFive() {
        assertEquals(15, Main.sum(5));
    }
}