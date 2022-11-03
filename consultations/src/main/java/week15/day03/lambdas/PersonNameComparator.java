package week15.day03.lambdas;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person one, Person other) {
        return one.getName().compareTo(other.getName());
    }


}
