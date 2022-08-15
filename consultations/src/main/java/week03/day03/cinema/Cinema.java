package week03.day03.cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<String> findMovieByTime(LocalDateTime time) {
        List<String> titles = new ArrayList<>();

        for (Movie actual : movies) {
            if (actual.getTimes().contains(time)) {
                titles.add(actual.getTitle());
            }
        }

        return titles;
    }


}
