import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminFeedbackServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/fcs","root","welcome");
		PreparedStatement p=c.prepareStatement("select * from feedback");
		ResultSet r=p.executeQuery();
		response.getWriter().println("<h1>Displaying all the feedbacks</h1>");
	
		response.getWriter().println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"ISO-8859-1\">\r\n"
				+ "    <title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
				+ "    integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n"
				+ "<style>\r\n"
				+ "    body {\r\n"
				+ "        background-color: black;\r\n"
				+ "        color: white;\r\n"
				+ "    }\r\n"
				+ "  table{\r\n"
				+ "      color: white;\r\n"
				+ "  }\r\n"
				+ "</style>");
		response.getWriter().println("<table class=\"table table-dark table-hover\">\r\n"
				+ "		<thead>\r\n"
				+ "			<th>stId</th>\r\n"
				+ "			<th>stName</th>\r\n"
				+ "			<th>Feedback</th>\r\n"
				+ "			<th>Institute_Name</th>\r\n"
				+ "		</thead>");
		while(r.next()) {
			response.getWriter().println("<tr>\r\n"
					+ "				<td>"+r.getString(1)+"</td>\r\n"
					+ "				<td>"+r.getString(2)+"</td>\r\n"
					+ "				<td>"+r.getString(3)+"</td>\r\n"
					+ "				<td>"+r.getString(4)+"</td>\r\n"
					+ "			</tr>");
		}
		response.getWriter().println("</table>");
		response.getWriter().println("<a href=http://localhost:8080/FinalCaseStudy/adminmenu.html><b>Back<b></a>");
	}
	catch (ClassNotFoundException e) {
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