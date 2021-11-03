
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentUpdateHomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String insid = request.getParameter("sid");
			int id = Integer.parseInt(insid);
			String inspass = request.getParameter("spass");
			String inscity = request.getParameter("sadd");
			String insmail = request.getParameter("smail");
			String inseats = request.getParameter("snum");
			String inscourses = request.getParameter("squal");
			Class.forName("com.mysql.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fcs", "root", "welcome");
			PreparedStatement p = c.prepareStatement("update stud set password = '" + inspass
					+ "', student_address = '" + inscity + "',student_email = '" + insmail + "' ,student_phno = '" + inseats
					+ "',student_qual = '" + inscourses + "'where Userid ='" + id + "'");
			p.executeUpdate();
			response.getWriter().println("<script>alert('Updated Successfully!')</script>");
			response.getWriter()
					.println("<a href=http://localhost:8080/FinalCaseStudy/StudentHome.html><b>Back<b></a>");
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
