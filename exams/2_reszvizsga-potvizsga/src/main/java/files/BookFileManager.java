package files;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookFileManager {

    private List<Book> books = new ArrayList<>();

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

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new IllegalArgumentException("Cannot find book with ISBN: " + isbn);
    }


    private void processLine(String line) {
        String[] temp = line.split(" ");
        books.add(new Book(temp[0], temp[1], temp[2]));
    }

    public List<Book> getBooks() {
        return books;
    }
}
