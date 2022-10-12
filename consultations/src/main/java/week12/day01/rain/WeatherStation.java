package week12.day01.rain;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeatherStation {

    private List<Rain> rainObservations = new ArrayList<>();

//    public void readFromFile(Path path) {
//        try {
//            List<String> lines = Files.readAllLines(path);
//            processLines(lines);
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file", ioe);
//        }
//    }
//
//    private void processLines(List<String> lines) {
//        for (String line : lines) {
//            String[] temp = line.split(";");
//            int quantity = Integer.parseInt(temp[0]);
//            LocalDate date = LocalDate.parse(temp[1]);
//            rainObservations.add(new Rain(quantity, date));
//        }
//    }

//    public void readFromFile(Path path) {
//        try {
//            Scanner reader = new Scanner(path);
//            try {
//                while (reader.hasNextLine()) {
//                    String line = reader.nextLine();
//                    processLine(line);
//                }
//            } finally {
//                reader.close();
//            }
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file", ioe);
//        }
//    }

//    public void readFromFile(Path path) {
//        try {
//            BufferedReader reader = Files.newBufferedReader(path);
//            try {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    processLine(line);
//                }
//            } finally {
//                reader.close();
//            }
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file", ioe);
//        }
//    }

//    public void readFromFile(Path path) {
//        try (Scanner reader = new Scanner(path)) {
//            while (reader.hasNextLine()) {
//                String line = reader.nextLine();
//                processLine(line);
//            }
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file", ioe);
//        }
//    }

    public void readFromFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private void processLine(String line) {
        String[] temp = line.split(";");
        String quantityNumber = temp[0];
        String dateNumber = temp[1];
        try {
            int quantity = Integer.parseInt(quantityNumber);
            LocalDate date = LocalDate.parse(dateNumber);
            rainObservations.add(new Rain(quantity, date));
        } catch (NumberFormatException | DateTimeParseException ex) {
            throw new RainObservationNotCorrectException(quantityNumber, dateNumber, ex);
        }
    }

    public int getRainQuantityInMonth(int year, int month) {
        int sum = 0;
        for (Rain rain : rainObservations) {
            if (rain.getDate().getYear() == year && rain.getDate().getMonthValue() == month) {
                sum += rain.getQuantity();
            }
        }
        return sum;
    }
}
