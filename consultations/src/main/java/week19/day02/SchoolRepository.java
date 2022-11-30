package week19.day02;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolRepository {

    private JdbcTemplate jdbcTemplate;

    public SchoolRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public long insertSchoolWithoutStudents(School school){
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(conn->{
            PreparedStatement ps = conn.prepareStatement("insert into schools (school_name,city) values(?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,school.getSchoolName());
            ps.setString(2,school.getCity());
            return ps;
        }, holder);

        return holder.getKey().longValue();
    }

    public School findSchoolById(long id){
        return jdbcTemplate.query("select school_name, city from schools where id = ?",
                (rs, rowNum) -> new School(rs.getString("school_name"),rs.getString("city")),id).get(0);
    }
}
