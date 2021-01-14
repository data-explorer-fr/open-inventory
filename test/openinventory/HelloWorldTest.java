package openinventory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test {@link HelloWorld} class.
 */
public class HelloWorldTest {
    /**
     * Test {@link HelloWorld#calculate()} method.
     */
    @Test
    public void testHelloWorld() {
        Shell shell = new Shell();
        assertEquals("global", shell.getClassName(), "expected global");
    }
}
