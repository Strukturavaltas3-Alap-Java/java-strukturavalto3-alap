package week14.day01.age;

import java.util.Arrays;

public class AgeSorter {

    public int[] sortAges(int[] ages) {
        // [5, 75, 23, 63, 2]
        // [5, 0, 23, 63, 2]
        // [5, 0, 23, 0, 2]

        int[] result = new int[ages.length];
        for (int i = ages.length - 1;  i >= 0; i--) {
            Max max = findMax(ages);
            result[i] = max.getMaxNumber();
            ages[max.getMaxIndex()] = 0;
        }
        return result;
    }

    private Max findMax(int[] ages) {
        int maxNumber = ages[0];
        int maxIndex = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > maxNumber) {
                maxNumber = ages[i];
                maxIndex = i;
            }
        }
        return new Max(maxNumber, maxIndex);
    }

    public static void main(String[] args) {
        AgeSorter ageSorter = new AgeSorter();
        System.out.println(Arrays.toString(ageSorter.sortAges(new int[]{5, 75, 23, 63, 2})));
    }
}
