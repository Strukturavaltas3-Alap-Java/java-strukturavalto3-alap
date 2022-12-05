package person;

public class PersonService {

    private PersonDao personDao = new PersonDao();

    public void savePerson(String name, int age) {
        Person person = new Person(name, age);
        personDao.savePerson(person);
    }
}
