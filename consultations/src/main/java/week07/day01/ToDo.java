package week07.day01;

import java.time.LocalDate;
import java.util.List;

public class ToDo {

    private LocalDate date;
    private List<String> toDos;

    public ToDo(LocalDate date, List<String> toDos) {
        this.date = date;
        this.toDos = toDos;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<String> getToDos() {
        return toDos;
    }
}
