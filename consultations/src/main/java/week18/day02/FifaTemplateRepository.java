package week18.day02;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class FifaTemplateRepository {

    private JdbcTemplate jdbcTemplate;

    public FifaTemplateRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void saveGame(Game game){
        jdbcTemplate.update("insert into fifa_world_cup (date_of_game, first_team, second_team, first_team_score, second_team_score) values(?,?,?,?,?)",
                game.getDateOfGame(), game.getFirstTeam(),game.getSecondTeam(),game.getFirstTeamScore(),game.getSecondTeamScore());
    }
}

