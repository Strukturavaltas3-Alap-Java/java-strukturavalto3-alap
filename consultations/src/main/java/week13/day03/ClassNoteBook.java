package week13.day03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassNoteBook {


    private Map<Long, List<Integer>> notebook = new HashMap<>();


    public void addStudent(Student student){
        notebook.put(student.getId(), new ArrayList<>());
    }

    public void addMark(Long id, int mark){
        if(notebook.get(id) ==null){
            throw new IllegalArgumentException("Id not exists: "+ id);
        }
        notebook.get(id).add(mark);
    }

    public Map<Long, List<Integer>> getNotebook() {
        return notebook;
    }
}
