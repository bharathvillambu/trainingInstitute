import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewFacultyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String name = request.getParameter("instname");
			Class.forName("com.mysql.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fcs", "root", "welcome");
			PreparedStatement pst = c.prepareStatement("select * from faculty where faculty_inst = '" + name + "'");
			ResultSet r = pst.executeQuery();
			response.getWriter().println("<h1>Displaying all the faculties</h1>");
			response.getWriter().println("<!DOCTYPE html>\r\n" + "<html>\r\n" + "\r\n" + "<head>\r\n"
					+ "    <meta charset=\"ISO-8859-1\">\r\n" + "    <title>Insert title here</title>\r\n"
					+ "</head>\r\n"
					+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
					+ "    integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n"
					+ "<style>\r\n" + "    body {\r\n" + "        background-color: black;\r\n"
					+ "        color: white;\r\n" + "    }\r\n" + "  table{\r\n" + "      color: white;\r\n" + "  }\r\n"
					+ "</style>");
			response.getWriter()
					.println("<table class=\"table table-dark table-hover\">\r\n" + "		<thead>\r\n"
							+ "			<th>faculty_id</th>\r\n" + "			<th>faculty_name</th>\r\n"
							+ "			<th>faculty_course</th>\r\n" + "		</thead>");
			while (r.next()) {
				response.getWriter()
						.println("<tr>\r\n" + "				<td>" + r.getInt(1) + "</td>\r\n" + "				<td>"
								+ r.getString(2) + "</td>\r\n" + "				<td>" + r.getString(3) + "</td>\r\n"
								+ "			</tr>");
			}
			response.getWriter().println("</table>");
			response.getWriter()
					.println("<a href=http://localhost:8080/FinalCaseStudy/institutehome.html><b>Back<b></a>");
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
