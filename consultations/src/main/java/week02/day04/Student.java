package week02.day04;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void addMark(int mark){
        marks.add(mark);
    }

    public double avgOfMarks(){
        if(marks.size()==0){
            return 0;
        }

        double sum = 0;
        for(int i=0;i<marks.size();i++){
            sum+=marks.get(i);
        }
        return sum/marks.size();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }
}
