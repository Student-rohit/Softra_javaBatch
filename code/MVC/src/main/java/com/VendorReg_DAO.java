package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class VendorReg_DAO {

    Connection conn;
    PreparedStatement prep;

    String query = "insert into vendor values(?,?,?)";

    MysqlDataSource ds;

    public VendorReg_DAO() {

        try {

            ds = new MysqlDataSource();

            ds.setURL("jdbc:mysql://localhost:3306/Softra_j2ee");
            ds.setUser("root");
            ds.setPassword("2550");

            conn = ds.getConnection();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public int saveVendor(VendorBean vb) {

        int status = 0;

        try {

            prep = conn.prepareStatement(query);

            prep.setInt(1, vb.getVenId());
            prep.setString(2, vb.getVenName());
            prep.setInt(3, vb.getMobile());

            status = prep.executeUpdate();

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return status;
    }
}