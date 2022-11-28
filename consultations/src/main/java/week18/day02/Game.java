package week18.day02;

import java.time.LocalDate;

public class Game {

    private Long id;
    private LocalDate dateOfGame;
    private String placeOfGame;
    private String firstTeam;
    private String secondTeam;
    private int firstTeamScore;
    private int secondTeamScore;

    public Game(LocalDate dateOfGame, String firstTeam, String secondTeam, int firstTeamScore, int secondTeamScore) {
        this.dateOfGame = dateOfGame;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
    }

    public Game(LocalDate dateOfGame, String placeOfGame, String firstTeam, String secondTeam, int firstTeamScore, int secondTeamScore) {
        this.dateOfGame = dateOfGame;
        this.placeOfGame = placeOfGame;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
    }

    public Game(Long id, LocalDate dateOfGame, String firstTeam, String secondTeam, int firstTeamScore, int secondTeamScore) {
        this.id = id;
        this.dateOfGame = dateOfGame;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
    }

    public Game(Long id, LocalDate dateOfGame, String placeOfGame, String firstTeam, String secondTeam, int firstTeamScore, int secondTeamScore) {
        this.id = id;
        this.dateOfGame = dateOfGame;
        this.placeOfGame = placeOfGame;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDateOfGame() {
        return dateOfGame;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public int getFirstTeamScore() {
        return firstTeamScore;
    }

    public int getSecondTeamScore() {
        return secondTeamScore;
    }

    public String getPlaceOfGame() {
        return placeOfGame;
    }
}
