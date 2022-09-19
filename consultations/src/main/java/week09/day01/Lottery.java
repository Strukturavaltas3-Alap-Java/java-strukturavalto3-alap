package week09.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int numbersLimit;
    private int numberOfChoice;

    public Lottery(int numbersLimit, int numberOfChoice) {
        this.numbersLimit = numbersLimit;
        this.numberOfChoice = numberOfChoice;
    }

    public List<Integer> startLottery() {
        List<Integer> result = new ArrayList<>();
        Random random = new Random();
        while (result.size() < numberOfChoice) {
            int chosen = random.nextInt(1, numbersLimit + 1);
            if (!result.contains(chosen)) {
                result.add(chosen);
            }
        }
        return result;
    }
}
