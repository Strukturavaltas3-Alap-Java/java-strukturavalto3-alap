package week07.day04.defaultconst;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {


    private List<Team> teams;

    public ChessTournament() {
        teams = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            teams.add(new Team());
        }
    }


    private void addPlayersToTeams(List<Player> players) {
        for(int i=0;i< teams.size()*2;i++){
            if(players.size()>=i+1){
                if(i%2==0){
                    teams.get(i/2).setPlayerOne(players.get(i));
                }else{
                    teams.get(i/2).setPlayerTwo(players.get(i));
                }
            }
        }

    }

    public List<Team> getTeams() {
        return teams;
    }
}
