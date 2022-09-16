package week08.day05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    Hiking hiking = new Hiking();

    @Test
    void testCalculateElevation() {

        List<Double> heights = new ArrayList<>(Arrays.asList(10.0, 20.0, 30.0, 2.0, 11.0, 5.0));

        assertEquals(29.0, hiking.calculatePlusElevation(heights), 0.0005);
    }

    @Test
    void testCalculateElevationDecreasing() {
        List<Double> heights = new ArrayList<>(Arrays.asList(10.0, 5.0, 4.0, 3.0));

        assertEquals(0.0, hiking.calculatePlusElevation(heights), 0.0005);
    }

}