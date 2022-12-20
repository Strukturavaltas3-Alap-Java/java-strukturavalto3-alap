package training360.datahandling;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class AnimalRepository {

    private JdbcTemplate jdbcTemplate;

    public AnimalRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void saveAnimal(Animal animal) {
        jdbcTemplate.update("insert into animals (animal_type, count_of_animal, date_of_observation) values(?,?,?) ",
                animal.getAnimalType(), animal.getCountOfAnimal(), animal.getDateOfObservation());
    }

    public List<Animal> findAllAnimals() {
        return jdbcTemplate.query("select id, animal_type, count_of_animal, date_of_observation from animals",
                (rs, rn) -> new Animal(
                        rs.getLong("id"),
                        rs.getString("animal_type"),
                        rs.getInt("count_of_animal"),
                        rs.getDate("date_of_observation").toLocalDate()
                ));
    }

    public int countAllByAnimalType(String animalType) {
        int count = jdbcTemplate.query("select sum(count_of_animal) from animals where animal_type=?",
                (rs, rn) -> rs.getInt(1), animalType).get(0);

        if (count == 0) {
            throw new IllegalArgumentException("No animal found!");
        }
        return count;
    }
}
