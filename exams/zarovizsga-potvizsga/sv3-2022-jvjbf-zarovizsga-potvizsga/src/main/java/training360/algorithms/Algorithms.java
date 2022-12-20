package training360.algorithms;

import java.util.List;

public class Algorithms {

    public int countMaximums(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("Numbers is empty!");
        }
        int max = numbers.get(0);
        int count = 0;
        for (Integer i : numbers) {
            if (i > max) {
                max = i;
                count = 1;
            } else if (i == max) {
                count++;
            }
        }
        return count;
    }
}
