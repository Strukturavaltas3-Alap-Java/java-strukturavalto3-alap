package week08.day05.longwords;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        LongWord longWord = new LongWord();

        List<String> test = List.of("ALM","LMA","MAF","AFA");

        System.out.println(longWord.getLongWord(test));
    }
}
