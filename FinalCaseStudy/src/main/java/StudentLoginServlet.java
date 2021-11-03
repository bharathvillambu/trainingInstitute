
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("user");
		String password = request.getParameter("password");
		try {
			ServletContext sr = getServletContext();
			String d = sr.getInitParameter("driver");
			String url = sr.getInitParameter("url");
			String user = sr.getInitParameter("user");
			String pass = sr.getInitParameter("pass");
			Class.forName(d);
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stm = (Statement) con.createStatement();
			ResultSet rs = stm.executeQuery(
					"select * from stud where Userid= '" + username + "' and password='" + password + "'");
			if (rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("StudentHome.html");
				rd.include(request, response);
				// response.getWriter().println("Login Success");
				// response.getWriter().println("<br><a
				// href=http://localhost:8080/TrainingInstituteWebApplication/StudentHome.html
				// >Go to Student Menu</a>");
			} else {
				response.getWriter().println("<script>alert('login failed Invalid Credentials')</script>");
				RequestDispatcher rd = request.getRequestDispatcher("StudentLogin.html");
				rd.include(request, response);
			}
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
