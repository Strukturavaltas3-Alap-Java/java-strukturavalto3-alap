package week06.day03;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FirstATest {

    @Test
    void testLoad() {
        FirstA firstA = new FirstA(Paths.get("src/test/resources/schoolequipment.csv"));

        assertEquals(7, firstA.getEquipments().size());
        assertEquals("vonalas füzet", firstA.getEquipments().get(1).getName());
        assertEquals(50, firstA.getEquipments().get(4).getPieces());
    }

    @Test
    void testLoadFromWrongFile() {
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> new FirstA(Paths.get("src/test/resources/xyz.csv")));
        assertEquals("Can not read file", exception.getMessage());
    }
}