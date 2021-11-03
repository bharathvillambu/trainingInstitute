

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession();
		Object o = hs.getAttribute("USER");
		String user = (String) o; 
		response.getWriter().print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<link rel=\"stylesheet\"\r\n"
				+ "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n"
				+ "<title>ADMIN MENU</title>\r\n"
				+ "<style>\r\n"
				+ "h4 {\r\n"
				+ "	font-size: 45px;\r\n"
				+ "	text-align: center;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "h5 {\r\n"
				+ "	text-align: center;\r\n"
				+ "}\r\n"
				+ ".dd{\r\n"
				+ "text-align:center;\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "<script type=\"text/javascript\">\r\n"
				+ "	function yourMessage() {\r\n"
				+ "		alert(\"Redirecting To Homepage..\");\r\n"
				+ "	}\r\n"
				+ "</script>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<nav class=\"navbar navbar-expand-lg navbar-light bg-warning\">\r\n"
				+ "		<div class=\"container-fluid\">\r\n"
				+ "			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
				+"<h5>Hi "+user+"</h5>"
				+ "				<ul class=\"aboutus navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
				+ "					<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
				+ "						aria-current=\"page\" href=\"index.jsp\" onclick=\"yourMessage()\">LogOut</a></li>\r\n"
				+ "				</ul>\r\n"
				+ "			</div>\r\n"
				+ "		</div>\r\n"
				+ "	</nav>\r\n"
				+ "	<div class=\"con container-fluid\">\r\n"
				+ "		<h4>Training Institute</h4>\r\n"
				+ "		<br> <br>\r\n"
				+ "		<h5>Administrator Page</h5>\r\n"
				+ "		<br>\r\n"
				+ "		<br>\r\n"
				+ "		<div class=\"dd dropdown\">\r\n"
				+ "			<Button class=\"bn btn dropdown-toggle btn-outline-primary\"\r\n"
				+ "				data-toggle=\"dropdown\">\r\n"
				+ "				Administrator Options <span class=\"caret\"></span>\r\n"
				+ "			</Button>\r\n"
				+ "			<ul class=\"menu dropdown-menu\">\r\n"
				+ "				<li><a class=\"dropdown-item\" href=\"ViewInstitutes.html\">View\r\n"
				+ "						Institutes</a></li>\r\n"
				+ "				<li><a class=\"dropdown-item\" href=\"ViewStudents.html\">View\r\n"
				+ "						Students</a></li>\r\n"
				+ "				<li><a class=\"dropdown-item\" href=\"DeleteInstitutes.html\">Delete\r\n"
				+ "						Institutes</a></li>\r\n"
				+ "				<li><a class=\"dropdown-item\" href=\"AdminViewFeedback.html\">View\r\n"
				+ "						Feedback</a></li>\r\n"
				+ "			</ul>\r\n"
				+ "		</div>\r\n"
				+ "\r\n"
				+ "	</div>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "<script\r\n"
				+ "	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n"
				+ "<script\r\n"
				+ "	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n"
				+ "<script\r\n"
				+ "	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n"
				+ "</html>");
	}

}
