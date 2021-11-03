
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("sid");
		String name = request.getParameter("sname");
		String instname = request.getParameter("instname");
		String feedback = request.getParameter("sf");
		ServletContext sr = getServletContext();
		String d = sr.getInitParameter("driver");
		String url = sr.getInitParameter("url");
		String user = sr.getInitParameter("user");
		String pass = sr.getInitParameter("pass");
		try {
			Class.forName(d);
			Connection c = DriverManager.getConnection(url, user, pass);
			PreparedStatement pst = c.prepareStatement("insert into feedback values (?,?,?,?)");
			pst.setString(1, id);
			pst.setString(2, name);
			pst.setString(3, instname);
			pst.setString(4, feedback);
			pst.execute();
			response.getWriter().println("<script>alert('Feedback Sent!')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("StudentHome.html");
			rd.include(request, response);
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			{

			}
		}

	}
}