package streams;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PlayerService {

    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Set<String> findTeams() {
        return players.stream()
                .map(Player::getTeam)
                .collect(Collectors.toSet());
    }

    public Optional<Player> findPlayerWithMaxGoals() {
        return players.stream()
                .max(Comparator.comparing(Player::getNumberOfGoals));
    }


    public List<Player> findPlayersBirthBefore(LocalDate date) {
        return players.stream()
                .filter(p -> p.getDateOfBirth().isBefore(date))
                .collect(Collectors.toList());
    }

    public List<Player> findPlayersBirthAfterScoredMoreThan(LocalDate date, int amount) {
        return players.stream()
                .filter(p -> p.getDateOfBirth().isAfter(date))
                .filter(p -> p.getNumberOfGoals() > amount)
                .sorted(Comparator.comparing(Player::getName))
                .collect(Collectors.toList());
    }
}
