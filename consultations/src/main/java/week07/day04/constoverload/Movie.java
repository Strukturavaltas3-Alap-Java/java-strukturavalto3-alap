package week07.day04.constoverload;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int length;
    private List<String> actors = new ArrayList<>();
    public Movie(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public Movie(String title, int length, List<String> actors) {
        this(title, length);
        this.actors = actors;
    }

    public void addActor(String name) {
        actors.add(name);
    }
}
