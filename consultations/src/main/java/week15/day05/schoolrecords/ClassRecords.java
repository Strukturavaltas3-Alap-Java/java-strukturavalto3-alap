package week15.day05.schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class ClassRecords {

    private List<Student> students = new ArrayList<>();

    private String className;

    private Random random;

    public ClassRecords(String className, Random random) {
        validate(className);
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(String name) {
        validate(name);
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return false;
            }
        }
        return students.add(new Student(name));
    }

    public boolean removeStudent(String name) {
        validate(name);
//        Student foundStudent = null;
//        for (Student student : students) {
//            if (student.getName().equals(name)) {
//                foundStudent = student;
//            }
//        }
        Optional<Student> foundStudent = students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst();
        if (foundStudent.isPresent()) {
            students.remove(foundStudent);
            return true;
        }
        return false;
    }

    public double calculateClassAverageBySubject(String subjectName) {
        validate(subjectName);
//        double average = 0.0;
//        int count = 0;
//        for (Student student : students) {
//            double studentAverage = student.calculateSubjectAverage(subjectName);
//            if (studentAverage != 0) {
//                average += studentAverage;
//                count++;
//            }
//        }
//        average = average / count;
//        return Math.round(average * 100) / 100.0;

        return students.stream()
              .filter(student -> student.calculateSubjectAverage(subjectName) != 0)
              .mapToDouble(student -> student.calculateSubjectAverage(subjectName))
              .average()
              .orElseThrow(() -> new IllegalArgumentException("No students have average from this subject"));
    }

    public Student findStudentByName(String name) {
        validate(name);
        if (students.isEmpty()) {
            throw new IllegalArgumentException("No students to search!");
        }
//        for (Student student : students) {
//            if (student.getName().equals(name)) {
//                return student;
//            }
//        }
//        throw new IllegalArgumentException("No student found with name: " + name);
        return students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No student found with name: " + name));
    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalArgumentException("No students to select for repetition!");
        }
        int index = random.nextInt(students.size());
        return students.get(index);
    }

    public List<SubjectResult> listSubjectResults(String subjectName) {
        validate(subjectName);
//        List<SubjectResult> results = new ArrayList<>();
//        for (Student student : students) {
//            double studentAverage = student.calculateSubjectAverage(subjectName);
//            if (studentAverage != 0) {
//                SubjectResult result = new SubjectResult(student.getName(), studentAverage);
//                results.add(result);
//            }
//        }
//        return results;
        return students.stream()
                .filter(student -> student.calculateSubjectAverage(subjectName) != 0)
                .map(student -> new SubjectResult(student.getName(),  student.calculateSubjectAverage(subjectName)))
                .toList();
    }

    public String listStudentNames() {
        StringBuilder studentNames = new StringBuilder();
//        for (Student student : students) {
//            studentNames.append(student.getName());
//            if (student != students.get(students.size() - 1)) {
//                studentNames.append(", ");
//            }
//        }
//        return studentNames.toString();
        students.stream()
                .forEach(student -> studentNames.append(student.getName()).append(", "));
        String names = studentNames.toString();
        return names.substring(0,  names.length() - 2);
    }

    private void validate(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty!");
        }
    }
}
