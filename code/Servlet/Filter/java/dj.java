package dj;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Enumeration;

/**
 * Servlet implementation class dj
 */
public class dj extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dj() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  // Sending data to filter
//        request.setAttribute("username", "Rohit1");
//
//        // Forward request
//        RequestDispatcher rd =
//                request.getRequestDispatcher("Login");

     //   rd.forward(request, response);
		ServletContext sc =request.getServletContext();
		
		
		Enumeration<String> s=	sc.getAttributeNames();
		 while(s.hasMoreElements())
	        {
	            String name = s.nextElement();

	            String value =
	                    (String) sc.getAttribute(name);

	            System.out.println(name + " : " + value);
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
