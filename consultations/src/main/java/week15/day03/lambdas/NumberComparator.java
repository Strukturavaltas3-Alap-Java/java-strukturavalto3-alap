package week15.day03.lambdas;

import java.util.Comparator;

public class NumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer one, Integer other) {
//        return one.compareTo(other);
//        return Integer.compare(one, other);
        return one - other;
    }
}
