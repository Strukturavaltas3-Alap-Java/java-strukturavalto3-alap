package week06.day04;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("first line", "YYEEEE", "third line");
        try {
            Path path = Path.of("lines1.txt");
            if(Files.exists(path)){
                System.out.println("Létezik");
            }
            List<String> oldLines = Files.readAllLines(path);
            oldLines.addAll(lines);
            Files.write(path, oldLines);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot reach file", e);
        }

    }
}
