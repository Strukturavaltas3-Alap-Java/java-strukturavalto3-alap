package week19.day01.jdbc;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }

    public Person getPersonById(int id) {
        return people.get(id);
    }

    public void updatePerson(int id, String newName) {
        Person person = people.get(id);
        person.setName(newName);
    }

    public void deletePerson(int id) {
        people.remove(id);
    }
}
