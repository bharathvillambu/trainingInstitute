
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

public class RegisterStudent2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid = request.getParameter("stid");
		String sname = request.getParameter("stname");
		String squal = request.getParameter("stqual");
		String scity = request.getParameter("stadd");
		String snum = request.getParameter("stnum");
		String smail = request.getParameter("stmail");
		String suid = request.getParameter("stuid");
		String spass =  request.getParameter("spass");
		String sdob =  request.getParameter("stdob");
		try {
			ServletContext sr = getServletContext();
			String d = sr.getInitParameter("driver");
			String url = sr.getInitParameter("url");
			String user = sr.getInitParameter("user");
			String pass = sr.getInitParameter("pass");
			Class.forName(d);
			Connection c = DriverManager.getConnection(url, user, pass);
			PreparedStatement p = c.prepareStatement("insert into stud values(?,?,?,?,?,?,?,?,?,?)");
			p.setInt(1, Integer.parseInt(sid));
			p.setString(4, null);
			p.setString(2, sname);
			p.setString(3, squal);
			p.setString(5, scity);
			p.setString(6, snum);
			p.setString(7, smail);
			p.setInt(8, Integer.parseInt(suid));
			p.setString(9, spass);
			p.setString(10, sdob);
			p.execute();
			response.getWriter().println("<script>alert('Student Registered Successfully')</script>");
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
	}
}
