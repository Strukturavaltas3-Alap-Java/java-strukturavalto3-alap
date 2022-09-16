package week08.day05.longwords;

import java.util.List;

public class LongWord {

    public String getLongWord(List<String> partsOfWord) {
//        String firstPart = partsOfWord.get(0);
//        StringBuilder sb = new StringBuilder(firstPart);
////        for(int i=1;i<partsOfWord.size();i++){
////            sb.append(partsOfWord.get(i).charAt(firstPart.length()-1));
////        }

        String lastPart = partsOfWord.get(partsOfWord.size()-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<partsOfWord.size()-1;i++){
            sb.append(partsOfWord.get(i).charAt(0));
        }
        sb.append(lastPart);
        return sb.toString();
    }
}
