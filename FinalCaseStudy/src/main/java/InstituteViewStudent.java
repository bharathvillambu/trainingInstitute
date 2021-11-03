import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.traininginstitute.entities.Student;
public class InstituteViewStudent extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f = cfg.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		List l=s.createCriteria(Student.class).list();
//		Query q=s.createQuery("from Stud where inst_name='abc for tech'"); 
//        q.setParameter("INST", "abc for tech");  
		//List l=  q.list();
	response.getWriter().println("<!DOCTYPE html>\r\n"
			+ "<html>\r\n"
			+ "<head>\r\n"
			+ "<meta charset=\"ISO-8859-1\">\r\n"
			+ "<link rel=\"stylesheet\"\r\n"
			+ "	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\r\n"
			+ "<title>Insert title here</title>\r\n"
			+ "<style>\r\n"
			+ "h4 {\r\n"
			+ "	font-size: 45px;\r\n"
			+ "	text-align: center;\r\n"
			+ "}\r\n"
			+ "\r\n"
			+ "h5 {\r\n"
			+ "	text-align: center;\r\n"
			+ "}\r\n"
			+ "\r\n"
			+ ".btn {\r\n"
			+ "	text-align: center;\r\n"
			+ "	background-color: black;\r\n"
			+ "	color: white;\r\n"
			+ "}\r\n"
			+ "\r\n"
			+ ".botom {\r\n"
			+ "	margin-top: 500px;\r\n"
			+ "}\r\n"
			+ ".c {\r\n"
			+ "font-size: 22px;\r\n"
			+ "}\r\n"
			+ ".c {\r\n"
			+ "font-size: 22px;\r\n"
			+ "}\r\n"
			+ "body {\r\n"
			+ " background-color:gray;\r\n"
			+ "}\r\n"
			+ ".con {\r\n"
			+ "background-color: white;\r\n"
			+ "}\r\n"
			+ "\r\n"
			+ ".cpy {\r\n"
			+ "	margin-left: 636px;\r\n"
			+ "}\r\n"
			+ "/* body {\r\n"
			+ "background:url(\"C:/Users/pchan/Desktop/Templates/img39.jpg\")\r\n"
			+ "		no-repeat center center fixed;\r\n"
			+ "	background-size: cover;\r\n"
			+ "} */\r\n"
			+ "</style>\r\n"
			+ "<script type=\"text/javascript\">\r\n"
			+ "	function yourMessage() {\r\n"
			+ "		alert(\"Redirecting To Homepage..\");\r\n"
			+ "	}\r\n"
			+ "</script>\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "	<nav class=\"navbar navbar-expand-lg navbar-light bg-warning fixed-top\">\r\n"
			+ "		<div class=\"container-fluid\">\r\n"
			+ "			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
			+ "				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
			+ "					<li class=\"nav-item\"><a class=\"nav-link active\"\r\n"
			+ "						aria-current=\"page\" href=\"index.jsp\" onclick=\"yourMessage()\">Home</a></li>\r\n"
			+ "						<li class=\" c heading cpy nav-item\"><a class=\"nav-link active\"\r\n"
			+ "						aria-current=\"page\">Training Institute</a></li>\r\n"
			+ "				</ul>\r\n"
			+ "				\r\n"
			+ "			</div>\r\n"
			+ "		</div>\r\n"
			+ "	</nav>\r\n"
			+ "	<br><br>\r\n"
			+ "	<br><br>\r\n"
			+ "	<div class=\"con container-fluid\">\r\n"
			+ "	<table class=\"table table-striped table-hover\">\r\n"
			+ "	\r\n"
			+ "        <thead>\r\n"
			+ "            <tr>\r\n"
			+ "                <th scope=\"col\">STUDENT ID</th>\r\n"
			+ "                <th scope=\"col\">STUDENT NAME</th>\r\n"
			+ "                <th scope=\"col\">STUDENT QUALIFICATION </th>\r\n"
			+ "                <th scope=\"col\">INSTITUTE NAME</th>\r\n"
			+ "                <th scope=\"col\">STUDENT ADDRESS</th>\r\n"
			+ "                <th scope=\"col\">STUDENT PHONE</th>\r\n"
			+ "                <th scope=\"col\">STUDENT EMAIL</th>\r\n"
			+ "                <th scope=\"col\">USER ID</th>\r\n"
			+ "                <th scope=\"col\">PASSWORD</th>\r\n"
			+ "                <th scope=\"col\">STUDENT DOB</th>\r\n"
			+ "            </tr>\r\n"
			+ "        </thead>\r\n"
			+ "        <tbody>\r\n"
			+ "            <tr>\r\n"
			+ "                <td>106</td>\r\n"
			+ "                <td>BHARATH</td>\r\n"
			+ "                <td>BTECH</td>\r\n"
			+ "                <td>ABC FOR TECH</td>\r\n"
			+ "                <td>BANGLORE</td>\r\n"
			+ "                <td>8888888888</td>\r\n"
			+ "                <td>BHARATH@gmail.com</td>\r\n"
			+ "                <td>bharath</td>\r\n"
			+ "                <td>XXXXX</td>\r\n"
			+ "                <td>1999/02/12</td>\r\n"
			+ "            </tr>\r\n"
			+ "        </tbody>\r\n"
			+ "    </table>\r\n"
			+ "    </div>\r\n"
			+ "	<nav\r\n"
			+ "		class=\"botom navbar navbar-expand-lg navbar-light bg-warning fixed-bottom\">\r\n"
			+ "		<div class=\"container-fluid\">\r\n"
			+ "			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
			+ "				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
			+ "					<li class=\"cpy nav-item\"><a class=\"nav-link active\"\r\n"
			+ "						aria-current=\"page\">Copyrights @2021</a></li>\r\n"
			+ "				</ul>\r\n"
			+ "			</div>\r\n"
			+ "		</div>\r\n"
			+ "	</nav>\r\n"
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