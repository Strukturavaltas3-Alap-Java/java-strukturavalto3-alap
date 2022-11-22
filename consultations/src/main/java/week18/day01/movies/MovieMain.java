package week18.day01.movies;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class MovieMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try{
            dataSource.setUrl("jdbc:mariadb://localhost:3306/testdb-training?useUnicode=true");
            dataSource.setUser("training");
            dataSource.setPassword("training");
        }catch (SQLException se){
            throw new IllegalStateException("Cannot connect!",se);
        }

        MovieRepository repository = new MovieRepository(dataSource);

//        repository.saveMovie(new Movie("Titanic", LocalDate.of(1995,6,12),"James Cameron"));
//        repository.saveMovie(new Movie("Lord of the Rings",LocalDate.of(1999,12,11),"Peter Jackson"));

     //   repository.saveMovie(new Movie("Best Movie",LocalDate.of(1995,11,22),"Kristof Barczay"));

        List<Movie> result = repository.findMoviesByYear(1995);

        result.stream()
                .forEach(m-> System.out.println(m.getTitle()));


        result = repository.findMoviesByDirector("James Cameron");

        result.stream()
                .forEach(m-> System.out.println(m.getTitle()));

    }
}
