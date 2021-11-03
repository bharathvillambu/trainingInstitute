
import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.traininginstitute.entities.StudentRequestPOJO;

public class StudentSendRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentRequestPOJO req = new StudentRequestPOJO();
		String id = request.getParameter("sid");
		int sid = Integer.parseInt(id);
		String instname = request.getParameter("instname");
		ServletContext sr = getServletContext();
		String d = sr.getInitParameter("driver");
		String url = sr.getInitParameter("url");
		String user = sr.getInitParameter("user");
		String pass = sr.getInitParameter("pass");
		try {
			Class.forName(d);
			Connection c = DriverManager.getConnection(url, user, pass);
			PreparedStatement p = c.prepareStatement("select * from stud where Userid = " + sid);
			ResultSet r = p.executeQuery();
			while (r.next()) {
				req.setStudent_email(r.getString(7));
				req.setStudent_name(r.getString(2));
				req.setStudent_qual(r.getString(3));
				req.setInst_name(instname);
				req.setRequest_status("pending");
			}
			PreparedStatement pst = c.prepareStatement("insert into requests values (?,?,?,?,?,?)");
			pst.setInt(1, sid);
			pst.setString(2, req.getStudent_name());
			pst.setString(3, req.getStudent_email());
			pst.setString(4, req.getStudent_qual());
			pst.setString(5, instname);
			pst.setString(6, req.getRequest_status());
			pst.execute();
			response.getWriter().println("<script>alert('Request Sent Successfully')</script>");
			RequestDispatcher rd = request.getRequestDispatcher("StudentHome.html");
			rd.include(request, response);
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
