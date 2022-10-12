package week12.day03.algorithms;

import java.util.List;

public class Words {

    public int countWordsStartsWithUpperCase(List<String> words){
        int count = 0;
        for(String actual : words){
            if(actual.toUpperCase().charAt(0) == actual.charAt(0)){
                count++;
            }
        }

        return count;
    }
}
