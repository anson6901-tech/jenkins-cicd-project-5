package guru.elevatehub;

/**
 * A tiny class with pure methods that are easy to unit test.
 * Kept small on purpose so the focus stays on the pipeline.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
    return a * b;
}

@Test
void testMultiply() {
    Calculator calculator = new Calculator();
    assertEquals(6, calculator.multiply(2, 3));
}

}
