package week15.day05.rain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WeatherStation {

    private List<Rain> rainObservations = new ArrayList<>();

    public List<Rain> getRainObservations() {
        return new ArrayList<>(rainObservations);
    }

    public void readFromFile(Path path) {
//        try (BufferedReader reader = Files.newBufferedReader(path)) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                processLine(line);
//            }
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file", ioe);
//        }
        try {
            Stream<String> lines = Files.lines(path);
            processLines(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

//    private void processLine(String line) {
//        String[] temp = line.split(";");
//        String quantityNumber = temp[0];
//        String dateNumber = temp[1];
//        int quantity = Integer.parseInt(quantityNumber);
//        LocalDate date = LocalDate.parse(dateNumber);
//        rainObservations.add(new Rain(quantity, date));
//    }

    private void processLines(Stream<String> lines) {
        lines.forEach(line -> {
            String[] temp = line.split(";");
            String quantityNumber = temp[0];
            String dateNumber = temp[1];
            int quantity = Integer.parseInt(quantityNumber);
            LocalDate date = LocalDate.parse(dateNumber);
            rainObservations.add(new Rain(quantity, date));
        });
    }

    public int getRainQuantityInMonth(int year, int month) {
//        int sum = 0;
//        for (Rain rain : rainObservations) {
//            if (rain.getDate().getYear() == year && rain.getDate().getMonthValue() == month) {
//                sum += rain.getQuantity();
//            }
//        }
//        return sum;
        return rainObservations.stream()
                .filter(r -> r.getDate().getYear() == year && r.getDate().getMonthValue() == month)
                .mapToInt(Rain::getQuantity)
                .sum();
    }
}
