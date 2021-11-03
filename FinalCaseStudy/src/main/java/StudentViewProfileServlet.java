

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentViewProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	     try {
	    	   String id = request.getParameter("sid");
	    		ServletContext sr=getServletContext();
				String d=	sr.getInitParameter("driver");
				String url=	sr.getInitParameter("url");
				String user=sr.getInitParameter("user");
				String pass=sr.getInitParameter("pass");
				Class.forName(d);	
				Connection c=DriverManager.getConnection(url,user,pass);
				PreparedStatement p=c.prepareStatement("select * from stud where Userid='"+id+"'");
				ResultSet r=p.executeQuery();
				response.getWriter().println("<a href=StudentHome.html><b>Back<b></a>");
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
						+ "			<th>student_id</th>\r\n"
						+ "			<th>Userid</th>\r\n"
						+ "			<th>inst_name</th>\r\n"
						+ "			<th>student_address</th>\r\n"
						+ "			<th>student_dob</th>\r\n"
						+ "			<th>student_email</th>\r\n"
						+ "			<th>student_name</th>\r\n"
						+ "			<th>student_phno</th>\r\n"
						+ "			<th>student_qual</th>\r\n"
						+ "		</thead>");
				while(r.next()) {
					response.getWriter().println("<tr>\r\n"
							+ "				<td>"+r.getString(1)+"</td>\r\n"
							+ "				<td>"+r.getString(2)+"</td>\r\n"
							+ "				<td>"+r.getString(3)+"</td>\r\n"
							+ "				<td>"+r.getString(5)+"</td>\r\n"
							+ "				<td>"+r.getString(6)+"</td>\r\n"
						    + "				<td>"+r.getString(7)+"</td>\r\n"
							+ "				<td>"+r.getString(8)+"</td>\r\n"
						    + "				<td>"+r.getString(9)+"</td>\r\n"
						    + "				<td>"+r.getString(10)+"</td>\r\n"
							+ "			</tr>");
				}
				response.getWriter().println("</table>");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}




