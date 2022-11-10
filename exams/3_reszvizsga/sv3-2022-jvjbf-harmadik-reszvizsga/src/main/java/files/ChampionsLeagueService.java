package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ChampionsLeagueService {

    private Map<String, List<LocalDate>> schedule = new TreeMap<>();

    public void readFromFile(Path path){
        try(BufferedReader br = Files.newBufferedReader(path)){
            String line;
            while((line =br.readLine())!=null){
                processLine(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot reach file!",e);
        }
    }

    public Set<LocalDate> collectPlayDays(){
        return schedule.values()
                .stream()
                .flatMap(l->l.stream())
                .collect(Collectors.toSet());
    }

    public Set<String> findTeamsByDay(LocalDate date){
        return schedule.entrySet().stream()
                .filter(e->e.getValue().contains(date))
                .map(e->e.getKey())
                .collect(Collectors.toSet());
    }

    public String findTeamWithMostPlayedMatches(){
        return collectTeamsByPlayDays().entrySet()
                .stream().max(Comparator.comparing(e->e.getValue())).get().getKey();
    }

    private Map<String,Integer> collectTeamsByPlayDays(){
        return schedule.entrySet().stream()
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue().size()));
    }

    private void processLine(String line) {
        String[] temp = line.split(";");
        String[] teams = temp[1].split("-");
        LocalDate date = LocalDate.parse(temp[0]);
        addTeams(teams[0],date);
        addTeams(teams[1],date);
    }

    private void addTeams(String team, LocalDate date) {
        if(!schedule.containsKey(team)) {
            schedule.put(team, new ArrayList<>());
        }
        schedule.get(team).add(date);
    }

    public Map<String, List<LocalDate>> getSchedule() {
        return schedule;
    }
}
