package week16.day01.exam.movietheatres;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.*;

public class MovieTheatreService {

    private Map<String, List<Movie>> shows = new LinkedHashMap<>();

    public Map<String, List<Movie>> getShows() {
        return new LinkedHashMap<>(shows);
    }

    public void readFromFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void processLine(String line) {
        String[] temp = line.split("-");
        String[] tempMovie = temp[1].split(";");
        String nameOfCinema = temp[0];
        if (!shows.containsKey(nameOfCinema)) {
            shows.put(nameOfCinema, new ArrayList<>());
        }
        shows.get(nameOfCinema).add(new Movie(tempMovie[0], LocalTime.parse(tempMovie[1])));
        shows.get(nameOfCinema).sort(Comparator.comparing(Movie::getStartTime));
    }

    public List<String> findMovie(String titleOfMovie) {
//        List<String> cinemas = new ArrayList<>();
        Movie movie = new Movie(titleOfMovie, LocalTime.now());
//        for (Map.Entry<String, List<Movie>> entry : shows.entrySet()) {
//            if (entry.getValue().contains(movie)) {
//                cinemas.add(entry.getKey());
//            }
//        }
//        return cinemas;

        return shows.keySet().stream()
                .filter(c -> shows.get(c).contains(movie))
                .toList();
    }

    public LocalTime findLatestShow(String title) {
        return shows.keySet().stream()
                .flatMap(c -> shows.get(c).stream())
                .filter(m -> m.getTitle().equals(title)) // Stream<Movie>
                .map(m -> m.getStartTime()) // Stream<LocalTime>
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such movie."));

    }
}
