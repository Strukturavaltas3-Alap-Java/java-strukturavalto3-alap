package week07.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> numbers ;


    public NumberSequence(){
        numbers = new ArrayList<>();
    }
    public NumberSequence(List<Integer> numbers){
        this.numbers = numbers;
    }

    public void updateList(List<Integer> newNumbers) {
        numbers.addAll(newNumbers);
    }

    public void updateList(int n, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextInt(min, max + 1));
        }
    }

    public List<Integer> closeToAverage(int value) {
        double avg = calculateAvg();
        List<Integer> result = new ArrayList<>();
        for (Integer actual : numbers) {
            if (Math.abs(actual - avg) <= value) {
                result.add(actual);
            }
        }
        return result;
    }

    private double calculateAvg() {
        double sum = 0;
        for (Integer actual : numbers) {
            sum += actual;
        }
        return sum / numbers.size();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
