package week15.day03.lambdas;

import java.util.List;
import java.util.Optional;

public class PersonService {

    List<Person> people;

    public PersonService(List<Person> people) {
        this.people = people;
    }

    public Optional<Person> findPersonWithAgeAbove(int age) {
        if (people.isEmpty()) {
//            return null;
//            throw new IllegalArgumentException("Empty list");
            return Optional.empty();
        }
        Person person = null;
        for (Person p : people) {
            if (p.getAge() > age) {
//                return p;
                person = p;
            }
        }
//        return null;
//        throw new IllegalArgumentException("No such person");
        return Optional.of(person);
    }
}
