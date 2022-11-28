package week18.day02;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FifaWorldCupRepositoryTest {
    FifaWorldCupRepository fifaWorldCupRepository;
    @BeforeEach
    void init(){
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try{
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        }catch (SQLException se){
            throw new IllegalStateException("Cannot connect!",se);
        }


        fifaWorldCupRepository = new FifaWorldCupRepository(dataSource);
        Flyway flyway = Flyway.configure().cleanDisabled(false).dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();
    }

    @Test
    void testInsertAndGet(){
        fifaWorldCupRepository.insertGame(new Game(LocalDate.of(2022,11,24), "Budapest","Uruguay","South Korea",0,0));

       // Optional<Game> result = fifaWorldCupRepository.findGameById(1L);

        //assertEquals("Uruguay",result.get().getFirstTeam());
    }

    @Test
    void testMostGoalsInOneGame(){
        fifaWorldCupRepository.insertGame(new Game(LocalDate.of(2022,11,24),"Uruguay","South Korea",0,0));
        fifaWorldCupRepository.insertGame(new Game(LocalDate.of(2022,11,22),"France","Australia",4,1));
        fifaWorldCupRepository.insertGame(new Game(LocalDate.of(2022,11,22),"Germany","Japan",1,2));

        assertEquals(5, fifaWorldCupRepository.mostGoalsInOneGame());
    }

}