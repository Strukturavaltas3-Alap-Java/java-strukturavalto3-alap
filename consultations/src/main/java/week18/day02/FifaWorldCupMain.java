package week18.day02;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;

public class FifaWorldCupMain {

    public static void main(String[] args) {

//        MariaDbDataSource dataSource = new MariaDbDataSource();
//        try{
//            dataSource.setUrl("jdbc:mariadb://localhost:3306/fifadb?useUnicode=true");
//            dataSource.setUser("fifa");
//            dataSource.setPassword("fifa");
//        }catch (SQLException se){
//            throw new IllegalStateException("Cannot connect!",se);
//        }
//
//
//        FifaWorldCupRepository fifaWorldCupRepository = new FifaWorldCupRepository(dataSource);
//        Flyway flyway = Flyway.configure().cleanDisabled(false).dataSource(dataSource).load();
//
//        flyway.migrate();
//
//
////
////        fifaWorldCupRepository.insertGame(
////                new Game(LocalDate.of(2022,11,23),"Germany","Japan",1,2));
////
////
////        fifaWorldCupRepository.insertGame(
////                new Game(LocalDate.of(2022,11,22),"France","Australia",4,1)
////        );
////
////        fifaWorldCupRepository.insertGame(
////                new Game(LocalDate.of(2022,11,23),"Morocco","Croatia",0,0)
////        );
////
////        fifaWorldCupRepository.insertGame(
////                new Game(LocalDate.of(2022,11,22),"Denmark","Tunis",0,0)
////        );
////
////        fifaWorldCupRepository.insertGame(
////                new Game(LocalDate.of(2022,11,22),"Argentina","Saudi-Arabia",1,2)
////        );
////        fifaWorldCupRepository.insertGame(
////                new Game(LocalDate.of(2022,11,22),"Hungary","Greece",3,2)
////        );
//
//        fifaWorldCupRepository.findGamesByDate(LocalDate.of(2022,11,22))
//                .stream().forEach(g-> System.out.println(g.getFirstTeam()+" "+g.getSecondTeam()));
//
//        System.out.println(fifaWorldCupRepository.mostGoalsInOneGame());
//
//        fifaWorldCupRepository.findGamesWithMostGoals()
//                .stream().forEach(g-> System.out.println(g.getFirstTeam()+" "+g.getSecondTeam()));
//
//
//        System.out.println(fifaWorldCupRepository.findTeams());
    }
}
