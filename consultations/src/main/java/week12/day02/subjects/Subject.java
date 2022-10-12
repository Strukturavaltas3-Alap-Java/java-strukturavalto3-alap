package week12.day02.subjects;

public class Subject {

    private String teacher;
    private String subjectName;
    private String group;
    private int numberOfLesson;

    public Subject(String teacher, String subjectName, String group, int numberOfLesson) {
        this.teacher = teacher;
        this.subjectName = subjectName;
        this.group = group;
        this.numberOfLesson = numberOfLesson;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getGroup() {
        return group;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }
}
