import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberProgramTest {

    @Test
    void returnsLargestValue() {
        assertEquals(9, NumberProgram.findResult(new int[]{3, 7, 2, 9, 4}));
    }

    @Test
    void handlesSingleValue() {
        assertEquals(42, NumberProgram.findResult(new int[]{42}));
    }

    @Test
    void returnsLargestWhenAllValuesAreNegative() {
        assertEquals(-1, NumberProgram.findResult(new int[]{-5, -1, -9}));
    }

    @Test
    void returnsMinimumIntegerForEmptyArray() {
        assertEquals(Integer.MIN_VALUE, NumberProgram.findResult(new int[]{}));
    }
}
