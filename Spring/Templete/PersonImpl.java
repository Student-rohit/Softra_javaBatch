package com.core.Templete;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PersonImpl implements Dao {

    private JdbcTemplate jt;

    public void setJdbcTemplate(JdbcTemplate jt) {
        this.jt = jt;
    }

    @Override
    public int insert(Person p) {

        String sql =
            "insert into person(PER_ID, PER_NAME) values(?, ?)";

        return jt.update(
                sql,
                p.getPER_ID(),
                p.getPER_NAME()
        );
    }

    @Override
    public List<Person> getAll() {

        String sql =
            "select * from person";

        return jt.query(sql, new RowMapper<Person>() {

            @Override
            public Person mapRow(ResultSet rs, int rowNum)
                    throws SQLException {

                Person p = new Person();

                p.setPER_ID(
                        rs.getInt("PER_ID"));

                p.setPER_NAME(
                        rs.getString("PER_NAME"));

                return p;
            }
        });
    }
}