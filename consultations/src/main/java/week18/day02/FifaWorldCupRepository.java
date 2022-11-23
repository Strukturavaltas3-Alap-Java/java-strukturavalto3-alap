package week18.day02;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FifaWorldCupRepository {

    private DataSource dataSource;

    public FifaWorldCupRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void insertGame(Game game){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "insert into fifa_world_cup (date_of_game, first_team, second_team, first_team_score, second_team_score) values(?,?,?,?,?)"
            )){
            ps.setDate(1,Date.valueOf(game.getDateOfGame()));
            ps.setString(2,game.getFirstTeam());
            ps.setString(3,game.getSecondTeam());
            ps.setInt(4, game.getFirstTeamScore());
            ps.setInt(5, game.getSecondTeamScore());
            ps.executeUpdate();
        }catch (SQLException se){
            throw new IllegalStateException("Cannot connect!", se);
        }
    }

    public List<Game> findGamesByDate(LocalDate date){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select * from fifa_world_cup where date_of_game = ?"
            )){
            ps.setDate(1, Date.valueOf(date));
            return executePreparedStatement(ps);
        }catch(SQLException se){
            throw  new IllegalStateException("Cannot create query",se);
        }
    }

    private List<Game> executePreparedStatement(PreparedStatement ps) throws SQLException {
        List<Game> result = new ArrayList<>();
        try(ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                Long id = rs.getLong("id");
                LocalDate dateOfGame = rs.getDate("date_of_game").toLocalDate();
                String firstTeam = rs.getString("first_team");
                String secondTeam = rs.getString("second_team");
                int firstTeamScore = rs.getInt("first_team_score");
                int secondTeamScore = rs.getInt("second_team_score");
                result.add(new Game(id, dateOfGame,firstTeam,secondTeam,firstTeamScore,secondTeamScore));
            }
        }
        return result;
    }

    public int mostGoalsInOneGame(){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "select MAX(first_team_score+second_team_score) from fifa_world_cup"
            );
            ResultSet rs = ps.executeQuery()){
            if(rs.next()){
                return rs.getInt(1);
            }
            throw new IllegalStateException("Empty!");

        }catch(SQLException se){
            throw new IllegalStateException("Cannot make query!",se);
        }
    }

    //SELECT * FROM fifa_world_cup WHERE (goals_a+goals_b)=(SELECT max(goals_a+goals_b) FROM fifa_world_cup);
}
