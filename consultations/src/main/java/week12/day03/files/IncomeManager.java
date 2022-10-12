package week12.day03.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IncomeManager {


    private List<Income> incomes = new ArrayList<>();

    public void readIncomesFromFile(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
           String line;
           while((line = br.readLine())!=null){
               String[] temp = line.split(";");
               Income income = new Income(LocalDate.parse(temp[0]), Integer.parseInt(temp[1]));
               if(!incomes.isEmpty() && incomes.get(incomes.size()-1).getDate().isAfter(income.getDate())){
                    throw new IllegalArgumentException("Income date is not valid: "+income.getDate());
               }
               incomes.add(income);
           }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file!", ioe);
        }
    }

    public List<Income> getIncomes() {
        return incomes;
    }
}
