package week15.day05.rain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherStationTest {

    WeatherStation weatherStation;

    @BeforeEach
    void init() {
        weatherStation = new WeatherStation();
        weatherStation.readFromFile(Paths.get("src/test/resources/rain.csv"));
    }

    @Test
    void testReadFromFile() {
        assertEquals(8, weatherStation.getRainObservations().size());
    }

    @Test
    void testGetRainQuantityInMonth() {
        assertEquals(34, weatherStation.getRainQuantityInMonth(2022, 1));
        assertEquals(0, weatherStation.getRainQuantityInMonth(2022, 10));
    }
}