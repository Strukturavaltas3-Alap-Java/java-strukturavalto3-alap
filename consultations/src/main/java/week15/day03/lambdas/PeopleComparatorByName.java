package week15.day03.lambdas;

import java.util.function.Function;

public class PeopleComparatorByName implements Function<Person, String> {

    @Override
    public String apply(Person person) {
        return person.getName();
    }
}
