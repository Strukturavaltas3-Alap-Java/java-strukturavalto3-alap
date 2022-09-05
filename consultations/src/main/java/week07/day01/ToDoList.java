package week07.day01;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToDoList {


    private List<ToDo> toDoList = new ArrayList<>();

    public void createToDoListFromFile(Path path){
        try {
            processLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("Illegal path: "+path);
        }
    }

    private void processLines(Path path) throws IOException {
        Scanner scanner = new Scanner(path);        //List<String> lines = Files.readAllLines(path)
        while(scanner.hasNextLine()){               // for(String line : lines)
            String line = scanner.nextLine();
            String[] temp = line.split(";");  //[dátum,feladatok] =>feladatok : "celaning,washing,dentist"
            toDoList.add(new ToDo(LocalDate.parse(temp[0]),new ArrayList<>(Arrays.asList(temp[1].split(",")))));
        }
    }

    public List<ToDo> getToDoList() {
        return toDoList;
    }
}
