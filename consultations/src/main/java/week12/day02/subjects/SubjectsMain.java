package week12.day02.subjects;

import java.nio.file.Path;

public class SubjectsMain {

    public static void main(String[] args) {
        SubjectService subjectService = new SubjectService();

        subjectService.readSubjectsFromFile(Path.of("src/main/resources/beosztas.txt"));

        System.out.println(subjectService.summarizeNumberOfLessonsByTeacher("Albatros Aladin"));
    }
}
