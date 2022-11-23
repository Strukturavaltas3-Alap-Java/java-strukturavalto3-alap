package week18.day02;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;

public class FifaWorldCupMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try{
            dataSource.setUrl("jdbc:mariadb://localhost:3306/fifadb?useUnicode=true");
            dataSource.setUser("fifa");
            dataSource.setPassword("fifa");
        }catch (SQLException se){
            throw new IllegalStateException("Cannot connect!",se);
        }


        FifaWorldCupRepository fifaWorldCupRepository = new FifaWorldCupRepository(dataSource);
//
//        fifaWorldCupRepository.insertGame(
//                new Game(LocalDate.of(2022,11,23),"Germany","Japan",1,2));


        fifaWorldCupRepository.findGamesByDate(LocalDate.of(2022,11,22))
                .stream().forEach(g-> System.out.println(g.getFirstTeam()+" "+g.getSecondTeam()));

        System.out.println(fifaWorldCupRepository.mostGoalsInOneGame());
    }
}
