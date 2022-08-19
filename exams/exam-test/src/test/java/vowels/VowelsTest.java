package vowels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    Vowels vowels = new Vowels();

    @Test
    void testCountVowelsLowerWord(){
        assertEquals(3,vowels.countVowelsInWord("almafa"));
    }

    @Test
    void testCountVowelsMixedWord(){
        assertEquals(3, vowels.countVowelsInWord("Entrance"));
    }

    @Test
    void testCountVowelsZero(){
        assertEquals(0,vowels.countVowelsInWord("KLDJhhh"));
    }

}