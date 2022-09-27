package files;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncomeManager {

    private List<Income> incomes = new ArrayList<>();


    public void readIncomesFromFile(Path path) {
        try {
            Scanner scanner = new Scanner(path);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                processLine(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file!", e);
        }
    }

    private void processLine(String line) {
        String[] temp = line.split(";");
        Income income = new Income(LocalDate.parse(temp[0]), Integer.parseInt(temp[1]));
        if (incomes.size() > 0 && !income.getDate().isAfter(incomes.get(incomes.size() - 1).getDate())) {
            throw new IllegalArgumentException("Income date is not valid: " + income.getDate());
        }
        incomes.add(income);
    }

    public List<Income> getIncomes() {
        return incomes;
    }
}
