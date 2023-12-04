import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialCalculatorTestNGTest {
    @Test
    public void testFactorial() {
        assertEquals(FactorialCalculator.factorial(0), 1);
        assertEquals(FactorialCalculator.factorial(1), 1);
        assertEquals(FactorialCalculator.factorial(2), 2);
        assertEquals(FactorialCalculator.factorial(3), 6);
        assertEquals(FactorialCalculator.factorial(4), 24);
        assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialForNegativeNumbers() {
        FactorialCalculator.factorial(-1);
    }
}
