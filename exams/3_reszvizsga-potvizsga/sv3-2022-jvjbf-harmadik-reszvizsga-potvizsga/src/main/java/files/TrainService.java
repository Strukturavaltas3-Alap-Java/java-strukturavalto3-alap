package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class TrainService {

    private Map<String, List<Train>> schedule = new TreeMap<>();

    public void readFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            while ((line = br.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot reach file", e);
        }
    }

    public String findCityWithMostTrains() {
        return schedule.entrySet().stream()
                .max(Comparator.comparing(e -> e.getValue().size()))
                .orElseThrow(() -> new IllegalStateException("Data structure is empty!"))
                .getKey();
    }

    public String findDestinationByTrainId(String trainId) {
        return schedule.entrySet().stream()
                .filter(e -> e.getValue().stream().anyMatch(t -> t.getId().equals(trainId)))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Cannot find train with id: " + trainId))
                .getKey();
    }

    public List<LocalTime> findDeparturesToCity(String city) {
        if (!schedule.containsKey(city)) {
            throw new IllegalArgumentException("City is not in schedule: " + city);
        }

        return schedule.get(city).stream()
                .map(Train::getDepartureTime)
                .sorted()
                .collect(Collectors.toList());
    }

    private void processLine(String line) {
        String[] temp = line.split(";");
        String[] trainTemp = temp[1].split(" ");
        Train train = new Train(trainTemp[0], TrainType.valueOf(trainTemp[1]), LocalTime.parse(trainTemp[2]));
        schedule.computeIfAbsent(temp[0], k -> new ArrayList<>()).add(train);
    }

    public Map<String, List<Train>> getSchedule() {
        return new TreeMap<>(schedule);
    }
}
