package test.java.org.example;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class ExampleTest {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(4, result);
    }

}
