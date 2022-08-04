package week02.day04;

public class School {

    public static void main(String[] args) {

        Student student = new Student("John");
        student.addMark(4);
        student.addMark(5);
        student.addMark(5);
        System.out.println(student.avgOfMarks());

        Student student2 = new Student("Jane");
        System.out.println(student2.avgOfMarks());
        student2.addMark(2);
        student2.addMark(5);
        System.out.println(student2.getMarks());



    }
}
