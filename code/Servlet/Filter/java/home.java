package dj;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Servlet implementation class home
 */
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	ServletContext sc =request.getServletContext();
//	String s=	sc.getInitParameter("dj");
//	System.out.println(s);
//	
//	ServletConfig sf =getServletConfig();
//	String s2=sf.getInitParameter("dj");
//	
//	System.out.println(s2);
		
		
		ServletContext sc=request.getServletContext();
		sc.setAttribute("dj","2550");
		sc.setAttribute("dj2","2550");
		sc.setAttribute("dj3","2550");
		sc.setAttribute("dj4","2550");
		sc.setAttribute("dj5","2550");
		
  
		
		RequestDispatcher rd =request.getRequestDispatcher("dj");
		rd.forward(request, response);
//	response.sendRedirect("home.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
