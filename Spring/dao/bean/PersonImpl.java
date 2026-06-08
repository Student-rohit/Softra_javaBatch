package com.dao.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonImpl implements Dao {

	@Autowired
	private DataSource ds;

    public void setDs(DataSource ds) {
        this.ds = ds;
    }
    

    @Override
    public boolean create(Person p) {

        try {

            Connection conn = ds.getConnection();

            String sql = "INSERT INTO person(PER_ID, PER_NAME) VALUES(?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, p.getPER_ID());
            ps.setString(2, p.getPER_NAME());

            int row = ps.executeUpdate();

            ps.close();
            conn.close();

            if (row > 0) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    
    @Override
    public Person retrive(int id) {

        try {

            Connection conn = ds.getConnection();

            String sql =
            "SELECT * FROM person WHERE PER_ID = ?";

            PreparedStatement ps =
            conn.prepareStatement(sql);

            // Set ID Value
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Person p = new Person();

                p.setPER_ID(rs.getInt("PER_ID"));
                p.setPER_NAME(rs.getString("PER_NAME"));

                rs.close();
                ps.close();
                conn.close();

                return p;
            }

            rs.close();
            ps.close();
            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}