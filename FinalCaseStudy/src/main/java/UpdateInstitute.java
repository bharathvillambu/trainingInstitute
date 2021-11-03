import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpdateInstitute extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String insid = request.getParameter("insid");
			int id = Integer.parseInt(insid);
			String inspass = request.getParameter("inspass");
			String inscity = request.getParameter("inscity");
			String insmail = request.getParameter("insmail");
			String inseats = request.getParameter("insseats");
			String inscourses = request.getParameter("inscourses");
			int cr = Integer.parseInt(inscourses);
			int se = Integer.parseInt(inseats);
			Class.forName("com.mysql.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fcs", "root", "welcome");
			PreparedStatement p = c.prepareStatement("update institutes set inst_password = '" + inspass
					+ "', address = '" + inscity + "',inst_mail = '" + insmail + "' ,no_of_seats = '" + se
					+ "',no_of_courses = '" + cr + "' where inst_id ='" + id + "'");
			p.executeUpdate();
			response.getWriter().println("<script>alert('Updated Successfully!')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("institutehome.html");
			rd.include(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}