package week08.day05;

import java.util.List;

public class Hiking {

    public double calculatePlusElevation(List<Double> heights) {
        double fullElevation = 0;
        for (int i = 1; i < heights.size(); i++) {
            fullElevation += Math.max(heights.get(i) - heights.get(i - 1), 0);
        }
        return fullElevation;
    }
}
