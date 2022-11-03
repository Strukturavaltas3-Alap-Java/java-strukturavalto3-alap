package week15.day03.lambdas;

import java.util.function.Predicate;

public class PersonAgePredicate implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.getAge() > 40;
    }
}
