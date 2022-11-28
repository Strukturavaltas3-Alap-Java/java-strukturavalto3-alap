package week18.day02;

import javax.sql.DataSource;
import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class FifaWorldCupRepository {

    private DataSource dataSource;

    public FifaWorldCupRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void insertGame(Game game) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "insert into fifa_world_cup (date_of_game, place_of_game, first_team, second_team, first_team_score, second_team_score) values(?,?,?,?,?,?)"
             )) {
            ps.setDate(1, Date.valueOf(game.getDateOfGame()));
            ps.setString(2, game.getPlaceOfGame());
            ps.setString(3, game.getFirstTeam());
            ps.setString(4, game.getSecondTeam());
            ps.setInt(5, game.getFirstTeamScore());
            ps.setInt(6, game.getSecondTeamScore());
            ps.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot connect!", se);
        }
    }

    public Optional<Game> findGameById(long id){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("select * from fifa_world_cup where id=?")){
            ps.setLong(1,id);
            List<Game> result = executePreparedStatement(ps);
            if(result.isEmpty()){
                return Optional.empty();
            }
            return Optional.of(result.get(0));
        }catch (SQLException se) {
            throw new IllegalStateException("Cannot connect!", se);
        }
    }

    public List<Game> findGamesByDate(LocalDate date) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "select * from fifa_world_cup where date_of_game = ?"
             )) {
            ps.setDate(1, Date.valueOf(date));
            return executePreparedStatement(ps);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot create query", se);
        }
    }

    private List<Game> executePreparedStatement(PreparedStatement ps) throws SQLException {
        List<Game> result = new ArrayList<>();
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Long id = rs.getLong("id");
                LocalDate dateOfGame = rs.getDate("date_of_game").toLocalDate();
                String placeOfGame = rs.getString("place_of_game");
                String firstTeam = rs.getString("first_team");
                String secondTeam = rs.getString("second_team");
                int firstTeamScore = rs.getInt("first_team_score");
                int secondTeamScore = rs.getInt("second_team_score");
                Game game = new Game(id, dateOfGame, placeOfGame, firstTeam, secondTeam, firstTeamScore, secondTeamScore);
                result.add(game);
            }
        }
        return result;
    }

    public int mostGoalsInOneGame() {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(
                     "select MAX(first_team_score+second_team_score) from fifa_world_cup"
             );
             ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1);
            }
            throw new IllegalStateException("Empty!");

        } catch (SQLException se) {
            throw new IllegalStateException("Cannot make query!", se);
        }
    }

    public List<Game> findGamesWithMostGoals(){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM fifa_world_cup WHERE (first_team_score+second_team_score)=(SELECT max(first_team_score+second_team_score) FROM fifa_world_cup) "
            )){
            return executePreparedStatement(ps);
        }catch(SQLException se){
            throw new IllegalStateException("Cannot make query!", se);
        }
    }

    public Set<String> findTeams(){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("Select first_team, second_team from fifa_world_cup ");
            ResultSet rs = ps.executeQuery()){
            Set<String> result = new HashSet<>();
            while(rs.next()){
                result.add(rs.getString("first_team"));
                result.add(rs.getString("second_team"));
            }
            return result;
        }catch(SQLException se){
            throw new IllegalStateException("Cannot make query!", se);
        }
    }
//
//    SQL csak egyszer ad vissza egy csapatot:
//    SELECT distinct first_team AS team
//    FROM fifa_world_cup
//    UNION
//    SELECT distinct second_team AS team
//    FROM fifa_world_cup
}



//"SELECT * FROM fifa_world_cup WHERE (first_team_score+second_team_score)=(SELECT max(first_team_score+second_team_score) FROM fifa_world_cup)"