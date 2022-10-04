package files;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductFileManager {

    private List<Product> products = new ArrayList<>();

    public void readFromFile(Path path) {
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                processLine(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file!", e);
        }
    }

    public Product findProductWithMaxProfit() {
        if (products.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }
        Product max = products.get(0);
        for (Product actual : products) {
            if (actual.getProfit() > max.getProfit()) {
                max = actual;
            }
        }
        return max;
    }

    private void processLine(String line) {
        String[] temp = line.split(";");
        if (temp.length == 2) {
            products.add(new Product(temp[0], Integer.parseInt(temp[1])));
        } else {
            products.add(new Product(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2])));
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
