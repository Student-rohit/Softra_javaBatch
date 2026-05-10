<%@ page import="java.sql.*" %>
<%@ page import="com.mysql.cj.jdbc.MysqlDataSource" %>

//<%@page import="com.mysql.cj.jdbc.MysqlDataSource"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>employee data</title>
</head>
<body>
	<h2>Select Employee</h2>

<select>
	
	<%
	Connection conn;
	PreparedStatement prep;
	ResultSet rs;
	MysqlDataSource ds;
	ds= new MysqlDataSource();
	ds.setUser("root");
	ds.setPassword("2550");
	ds.setServerName("localhost");
	ds.setPort(3306);
	ds.setDatabaseName("Softra_j2ee");
	conn=ds.getConnection();
	prep=conn.prepareStatement("select * from employee");
	
	rs = prep.executeQuery();
	
	while(rs.next()){
		%>
		<option><%= rs.getString(2)%></option>
		<% 
		
	}
	%>
	
	</select>

</body>
</html>