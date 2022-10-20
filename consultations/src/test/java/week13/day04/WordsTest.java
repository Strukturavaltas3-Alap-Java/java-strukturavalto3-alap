package week13.day04;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {


    @Test
    void calculateVowelsInSentence(){
        Words words = new Words();
        Map<Character,Integer> result = words.calculateVowelsInSentence("This is an apple treeEEE");

        assertEquals(3, result.size());
        assertEquals(2, result.get('a'));
        assertEquals(6, result.get('e'));
    }

}