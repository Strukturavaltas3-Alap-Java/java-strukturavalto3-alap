package week07.day01;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToDoListTest {



    @Test
    void createToDoListFromFileTest(){
        ToDoList toDoList = new ToDoList();
        toDoList.createToDoListFromFile(Path.of("src/test/resources/todos.txt"));

        assertEquals(LocalDate.of(2022,9,6),toDoList.getToDoList().get(1).getDate());
        assertEquals(4, toDoList.getToDoList().size());
        assertEquals(3, toDoList.getToDoList().get(2).getToDos().size());
    }

}