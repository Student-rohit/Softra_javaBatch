package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class RegisteStudent
 */
public class RegisterStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterStudent() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		String id =request.getParameter("stdId");
		String name =request.getParameter("stdName");
		
		
		
		PrintWriter out = response.getWriter();
		out.print("student data  is" + id  +"<br>"  + name);
		
		try {
           

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/stuDB",
                "root",
                "2550"
            );

            String query = "INSERT INTO student VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, Integer.parseInt(id));
            ps.setString(2, name);

            int i = ps.executeUpdate();

            if(i > 0) {
                out.println("Data inserted successfully!");
            } else {
                out.println("Insertion failed!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace(out);
        } 
		}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
