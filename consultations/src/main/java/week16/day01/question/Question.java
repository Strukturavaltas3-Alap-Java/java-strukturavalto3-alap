package week16.day01.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Question {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 5, 1, 7, 9, 3, 4);
//        IntSummaryStatistics statistics = numbers.stream()
//                .mapToInt() // IntStream
//                .summaryStatistics();
//        statistics.getX

        List<String> names = Arrays.asList("Józsi", "Béla", "Ábel", "Pál", "Péter");
        List<String> orderedNames = new LinkedList<>(names.stream()
                .sorted(
//                        (name, other) -> Integer.compare(name.length(), other.length())
//                        (name, other) -> Integer.valueOf(name.length()).compareTo(other.length())
//                        (name, other) -> name.length() - other.length()
//                        Comparator.comparing(String::length)
                        Comparator.comparingInt(name -> name.length())
                )
                .collect(Collectors.toList()));
    }
}
