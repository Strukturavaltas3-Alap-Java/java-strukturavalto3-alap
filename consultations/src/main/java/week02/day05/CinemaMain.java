package week02.day05;

public class CinemaMain {

    public static void main(String[] args) {
        System.out.println(args[0]);
        Cinema cinema = new Cinema("Budapest");
        cinema.addNewMovie("Titanic");
        cinema.addNewMovie("LOTR");
        cinema.addNewMovie("Star Wars");
        cinema.addNewMovie("AZ");

        System.out.println(cinema.findLongestTitledMovie());


    }

}
