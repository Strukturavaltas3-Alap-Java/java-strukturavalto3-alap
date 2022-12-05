package person;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDao {

    private MariaDbDataSource dataSource;

    public PersonDao() {
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/person?useUnicode=true");
            dataSource.setUser("personuser");
            dataSource.setPassword("personpassword");
            Flyway flyway = Flyway.configure().dataSource(dataSource).load();
            flyway.migrate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not connect to database.", sqle);
        }
    }

    public void savePerson(Person person) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("insert into person (person_name, age) values (?, ?);")) {
            statement.setString(1, person.getName());
            statement.setInt(2, person.getAge());
            statement.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not insert");
        }
    }
}
