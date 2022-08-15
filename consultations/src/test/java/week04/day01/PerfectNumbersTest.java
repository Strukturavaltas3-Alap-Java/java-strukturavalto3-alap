package week04.day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    PerfectNumbers perfectNumbers = new PerfectNumbers();

    @Test
    void testIsPerfectNumberTrue(){
        assertTrue(perfectNumbers.isPerfectNumber(6));
        assertTrue(perfectNumbers.isPerfectNumber(33550336));
    }

    @Test
    void testIsPerfectNumberFalse(){
        assertFalse(perfectNumbers.isPerfectNumber(65273));
        assertFalse(perfectNumbers.isPerfectNumber(17));
    }

}