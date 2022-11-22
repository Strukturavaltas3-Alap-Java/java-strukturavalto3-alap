package week18.day01.movies;

import java.time.LocalDate;

public class Movie {

    private Long id;
    private String title;
    private LocalDate dateOfRelease;
    private String directorName;

    public Movie(String title, LocalDate dateOfRelease, String directorName) {
        this.title = title;
        this.dateOfRelease = dateOfRelease;
        this.directorName = directorName;
    }

    public Movie(Long id, String title, LocalDate dateOfRelease, String directorName) {
        this.id = id;
        this.title = title;
        this.dateOfRelease = dateOfRelease;
        this.directorName = directorName;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDateOfRelease() {
        return dateOfRelease;
    }

    public String getDirectorName() {
        return directorName;
    }
}
