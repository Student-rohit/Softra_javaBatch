package com.JDBC;

import java.sql.Connection;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Connection conn;
			
			Statement st;
			
//			String query ="insert into employee values(1,'java')";
			
			String query=" update employee set  empname='ROHIT' where empid=1";
		
			
			// get the connection to the DB server
			try {
			MysqlDataSource ds =new MysqlDataSource();
			
			// injecting the credentials into the ds object
			
			ds.setUser("root");
			ds.setPassword("2550");
			ds.setDatabaseName("softra_j2ee");
			ds.setServerName("localhost");
			ds.setPort(3306);
			
			conn=ds.getConnection();
			
			//embed the query into the statement object
			
			st=conn.createStatement();
			
			int row =st.executeUpdate(query);
			
			if(row>0) {
				System.out.println("Success");
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}