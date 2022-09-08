package week07.day04.defaultconst;

public class Team {


    private Player playerOne;
    private Player playerTwo;


    public Player getPlayerOne() {
        return playerOne;
    }


    public void  setPlayers(Player playerOne, Player playerTwo){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }
}
