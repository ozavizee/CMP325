package Ass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class primenumcheckertest {
    @Test
    public void isprimenumchecker() {
        primenumchecker maths = new primenumchecker();
        assertTrue(maths.isprimenumchecker(2));
        assertTrue(maths.isprimenumchecker(3));
        assertFalse(maths.isprimenumchecker(4));
        assertTrue(maths.isprimenumchecker(5));

    }
}
