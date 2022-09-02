package week06.day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class CourierFileManagerTest {

    @Test
    public void createCourierByFileTest(){
        Courier courier = new CourierFileManager().createCourierByFile(Path.of("src/test/resources/rides.txt"));

        assertEquals(8, courier.getRides().size());
        assertEquals(18, courier.getRides().get(courier.getRides().size()-1).getKm());
    }

    @Test
    public void testCreateCourierWrongFile(){
        assertThrows(IllegalArgumentException.class,()-> new CourierFileManager().createCourierByFile(Path.of("src/test/resources/rides2.txt")));
    }

}