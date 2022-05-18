package app.spring.repository;

import app.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository("JDBC")
public class StudentRepository {

    private static final String SQL_FIND_ALL = "SELECT * FROM students";

    private static final String SQL_FIND_NAME = "" +
            "SELECT students.name\n" +
            "FROM students\n" +
            "WHERE students.id = ? AND students.surname = ?";

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Student> findAll() {
        return jdbcTemplate.query(SQL_FIND_ALL, new Object[]{},
                (rs, i) -> Student.builder()
                        .id(Integer.parseInt(rs.getString("id")))
                        .name(rs.getString("name"))
                        .surname(rs.getString("surname"))
                        .salary(Integer.parseInt(rs.getString("salary")))
                        .build());
    }

    public String findName(Integer id, String surname) {
        return jdbcTemplate.queryForObject(SQL_FIND_NAME, new Object[]{id, surname}, String.class);
    }
}
