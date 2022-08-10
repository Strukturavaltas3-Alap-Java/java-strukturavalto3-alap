package week03.day03.cinema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private List<LocalDateTime> times;

    public Movie(String title, List<LocalDateTime> times) {
        this.title = title;
        this.times = times;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LocalDateTime> getTimes() {
        return times;
    }

    public void setTimes(List<LocalDateTime> times) {
        this.times = times;
    }
}


