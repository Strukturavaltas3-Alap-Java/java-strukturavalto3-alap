package algorithms;

import java.util.List;

public class Numbers {


    public boolean isPairInListWithSumOf(List<Integer> numbers, int value) {
        for (int i = 0; i < numbers.size(); i++) {
            if (checkPairsOfActual(numbers, value, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkPairsOfActual(List<Integer> numbers, int value, int actual) {
        for (int j = actual + 1; j < numbers.size(); j++) {
            if (numbers.get(actual) + numbers.get(j) == value) {
                return true;
            }
        }
        return false;
    }
}
