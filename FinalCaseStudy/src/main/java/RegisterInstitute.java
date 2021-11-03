
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

public class RegisterInstitute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		InstituteID instname = new InstituteID();
		// TODO Auto-generated method stub
		String insid = request.getParameter("insid");
		String insname = request.getParameter("insname");
		String inspass = request.getParameter("inspass");
		String insdob = request.getParameter("insdob");
		String inscity = request.getParameter("inscity");
		String insmail = request.getParameter("insmail");
		String insseat = request.getParameter("insseats");
		String inscourse = request.getParameter("inscourses");
		try {
			ServletContext sr = getServletContext();
			String d = sr.getInitParameter("driver");
			String url = sr.getInitParameter("url");
			String user = sr.getInitParameter("user");
			String pass = sr.getInitParameter("pass");
			Class.forName(d);
			Connection c = DriverManager.getConnection(url, user, pass);
			PreparedStatement p = c.prepareStatement("insert into institutes values(?,?,?,?,?,?,?,?)");
			p.setInt(1, Integer.parseInt(insid));
			p.setString(2, insname);
			p.setString(6, insmail);
			p.setString(4, insdob);
			p.setString(5, inscity);
			p.setInt(7, Integer.parseInt(insseat));
			p.setInt(8, Integer.parseInt(inscourse));
			p.setString(3, inspass);
			p.execute();
			response.getWriter().println("<script>alert('Your Organization is Successfully Registered')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			instname.setInsname(insname);
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.include(request, response);
	}
}
