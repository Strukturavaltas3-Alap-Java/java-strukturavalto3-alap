package week03.day04;

import java.util.List;

public class Stock {

    private List<Double> numbers;

    public Stock(List<Double> numbers) {
        this.numbers = numbers;
    }


    public double maxProfit() {
        double maxProfit = 0;
        for (int i = 0; i < numbers.size(); i++) {
            maxProfit = getMaxProfit(maxProfit, i);
        }
        return maxProfit;
    }

    private double getMaxProfit(double maxProfit, int i) {
        for (int j = i + 1; j < numbers.size(); j++) {
            double actualProfit = numbers.get(j) - numbers.get(i);
            if (actualProfit > maxProfit) {
                maxProfit = actualProfit;
            }
        }
        return maxProfit;
    }
}
