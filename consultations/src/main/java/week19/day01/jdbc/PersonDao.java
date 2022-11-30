package week19.day01.jdbc;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    private DataSource dataSource;

    public PersonDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

//    public void insertPerson() {
//        try (Connection connection = dataSource.getConnection();
//            Statement statement = connection.createStatement()) {
//            statement.executeUpdate("INSERT INTO person (name_of_person, date_of_birth, height, weight, gender) VALUES ('Kiss József', '1985-02-03', 187, 97.4, 'MALE');");
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Can not insert", sqle);
//        }
//    }


// CRUD C-Create
//    public void addPerson(Person person) {
//        people.add(person);
//    }

    public void insertPersonByParameters(Person person) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement
                     ("INSERT INTO person (name_of_person, date_of_birth, height, weight, gender) VALUES (?, ?, ?, ?, ?);")) {
            statement.setString(1, person.getName());
            statement.setDate(2, Date.valueOf(person.getDateOfBirth()));
            statement.setInt(3, person.getHeight());
            statement.setDouble(4, person.getWeight());
            statement.setString(5, person.getGender().toString());
            statement.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not insert", sqle);
        }
    }

// CRUD R-Read
//    public Person getPersonById(int id) {
//        return people.get(id);
//    }

    public Person findById(long id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("select * from person where id = ?;")) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name_of_person");
                LocalDate dateOfBirth = rs.getDate("date_of_birth").toLocalDate();
                int height = rs.getInt("height");
                double weight = rs.getDouble("weight");
                Gender gender = Gender.valueOf(rs.getString("gender"));
                return new Person(name, dateOfBirth, height, weight, gender);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not select", sqle);
        }
        throw new IllegalStateException("No such person");
    }

// CRUD R-Read
//    public List<Person> getPeople() {
//        return new ArrayList<>(people);
//    }

    public List<Person> listPeople() {
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("select * from person;")) {
            List<Person> result = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("name_of_person");
                LocalDate dateOfBirth = rs.getDate("date_of_birth").toLocalDate();
                int height = rs.getInt("height");
                double weight = rs.getDouble("weight");
                Gender gender = Gender.valueOf(rs.getString("gender"));
                result.add(new Person(name, dateOfBirth, height, weight, gender));
            }
            return result;
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not select", sqle);
        }
    }

// CRUD U-Update
//    public void updatePerson(int id, String newName) {
//        Person person = people.get(id);
//        person.setName(newName);
//    }

    public void updatePersonName(long id, String newName) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("update person set name_of_person = ? where id = ?;")) {
            statement.setString(1, newName);
            statement.setLong(2, id);
            statement.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not update", sqle);
        }
    }

// CRUD D-Delete
//    public void deletePerson(int id) {
//        people.remove(id);
//    }

    public void deletePerson(long id) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("delete from person where id = ?;")) {
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not delete", sqle);
        }
    }

    public static void main(String[] args) {
        PersonDao personDao;
        try {
            MariaDbDataSource mariaDbDataSource = new MariaDbDataSource();
            mariaDbDataSource.setUrl("jdbc:mariadb://localhost:3306/people?useUnicode=true");
            mariaDbDataSource.setUser("peopleuser");
            mariaDbDataSource.setPassword("peoplepassword");
            personDao = new PersonDao(mariaDbDataSource);

            Flyway flyway = Flyway.configure().locations("db/migration/person").cleanDisabled(false).dataSource(mariaDbDataSource).load();
//            flyway.clean();
            flyway.migrate();
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Can not reach database", sqle);
        }



//        personDao.insertPerson();

//        Person kissJozsef = new Person("Kiss József", LocalDate.of(1985, 2, 3), 187, 97.4, Gender.MALE);
//        personDao.insertPersonByParameters(kissJozsef);

//        personDao.updatePersonName(2, "Béla");

//        Person result = personDao.findById(2);
//        System.out.println(result.getName());

//        List<Person> result = personDao.listPeople();
//        System.out.println(result);

//        personDao.deletePerson(4);
    }
}
