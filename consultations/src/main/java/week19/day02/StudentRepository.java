package week19.day02;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class StudentRepository {

    private JdbcTemplate jdbcTemplate;

    public StudentRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insertStudent(Student student, long schoolId){
        jdbcTemplate.update("insert into students(student_name, student_year, school_id) values (?,?,?)", student.getName(),student.getSchoolYear(),schoolId);
    }
}
