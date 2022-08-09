package week03.day02;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int yearOfProduction;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }

    public int actorsInTheirTwenties(){
        int count = 0;
        for(Actor actual : actors){
            int ageAtProduction = yearOfProduction-actual.getYearOfBirth();
            if(ageAtProduction>=20 && ageAtProduction<30){
                count++;
            }
        }
        return count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public List<Actor> getActors() {
        return new ArrayList<>(actors);
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
