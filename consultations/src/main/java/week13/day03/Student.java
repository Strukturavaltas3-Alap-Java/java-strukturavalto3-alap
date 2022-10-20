package week13.day03;

public class Student implements Comparable<Student>{

    private Long id;
    private String name;

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Student student = (Student) o;
//
//        return id.equals(student.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return id.hashCode();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public int compareTo(Student o) {
        return Long.compare(id, o.id);
    }

    //It is strongly recommended, but not strictly required that (x.compareTo(y)==0) == (x.equals(y)).
}
