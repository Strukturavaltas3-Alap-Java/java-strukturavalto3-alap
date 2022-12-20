package training360.algorithms;

import java.util.List;

public class Algorithms {

    public boolean isChainOfWords(List<String> words) {
        for (int i = 1; i < words.size(); i++) {
            String actual = words.get(i).toLowerCase();
            String before = words.get(i - 1).toLowerCase();
            if (actual.charAt(0) != before.charAt(before.length() - 1)) {
                return false;
            }
        }
        return true;
    }
}
