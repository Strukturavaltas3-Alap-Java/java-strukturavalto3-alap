package algorithms;

import java.util.List;

public class Sentences {

    private String SENTENCE_ENDINGS = ".?!";

    public int countEndsWithSentenceEnding(List<String> sentences) {
        int count = 0;
        for (String actual : sentences) {
            if (SENTENCE_ENDINGS.indexOf(actual.charAt(actual.length() - 1)) >= 0) {
                count++;
            }
        }
        return count;
    }
}
