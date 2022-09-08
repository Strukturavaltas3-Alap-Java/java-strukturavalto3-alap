package week07.day04.constoverload;

import week07.day04.defaultconst.ChessTournament;

import java.util.List;

public class MovieMain {

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic",1995);
        Movie movie2 = new Movie("Star Wars",1977, List.of("Mark Hamill","Harrison Ford","Carry Fischer"));


        ChessTournament chessTournament = new ChessTournament();

        System.out.println(chessTournament.getTeams());

    }
}
