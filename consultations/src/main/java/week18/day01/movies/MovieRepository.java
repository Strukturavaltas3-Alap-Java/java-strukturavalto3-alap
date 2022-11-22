package week18.day01.movies;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private DataSource dataSource;

    public MovieRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveMovie(Movie movie) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("insert into movies (movie_title,date_of_production, name_of_director) values(?,?,?)");
        ) {
            ps.setString(1, movie.getTitle());
            ps.setDate(2, Date.valueOf(movie.getDateOfRelease()));
            ps.setString(3, movie.getDirectorName());
            ps.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot create connection or statement!", se);
        }
    }

    public List<Movie> findMoviesByYear(int year) {  //YEAR(date_of_production) = year
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select * from movies where YEAR(date_of_production)=?")) {
            ps.setInt(1, year);
            return processResultSet(ps);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot create connection or statement!", se);
        }
    }

    public List<Movie> findMoviesByDirector(String directorsName) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select * from movies where name_of_director like ?")){
            ps.setString(1, directorsName);
              return processResultSet(ps);
        }catch (SQLException se){
            throw new IllegalStateException("Cannot create connection or statement!",se);
        }
    }

    private List<Movie> processResultSet(PreparedStatement ps) throws SQLException {
        List<Movie> result = new ArrayList<>();
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Long id = rs.getLong("id");
                String title = rs.getString("movie_title");
                LocalDate date = rs.getDate("date_of_production").toLocalDate();
                String nameOfDirector = rs.getString("name_of_director");
                Movie movie = new Movie(id, title, date, nameOfDirector);
                result.add(movie);
            }
        }
        return result;
    }

}
