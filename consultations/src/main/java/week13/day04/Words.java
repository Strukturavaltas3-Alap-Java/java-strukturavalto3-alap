package week13.day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Words {

    private static final Set<Character> VOWELS = Set.of('a','e','i','o','u');

    public Map<Character,Integer> calculateVowelsInSentence(String sentence){
        sentence=sentence.toLowerCase();
        Map<Character,Integer> result = new HashMap<>();
        for(int i = 0;i<sentence.length();i++){
            char actual = sentence.charAt(i);
            if(VOWELS.contains(actual)){
                updateVowelsMap(result, actual);
            }
        }
        return result;
    }

    private void updateVowelsMap(Map<Character, Integer> result, char actual) {
        if(!result.containsKey(actual)){
            result.put(actual,1);
        }else {
            result.put(actual, result.get(actual) + 1);
        }
    }

}
