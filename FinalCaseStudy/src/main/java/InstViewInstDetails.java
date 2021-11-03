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

import com.traininginstitute.entities.Institute;
import com.traininginstitute.entities.Student;

public class InstViewInstDetails extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("instid");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f = cfg.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Institute institute=(Institute) s.load(Institute.class, new Integer(id));
		response.getWriter().println("<a href=institutehome.html>back</a>");
		response.getWriter().println("<table align=\"center\" bgcolor=\"skyblue\" border=\"2\">\r\n"
				+ "		<thead>\r\n"
				+ "			<th>id</th>\r\n"
				+ "			<th>name</th>\r\n"
				+ "			<th>affilationdate</th>\r\n"
				+ "			<th>address</th>\r\n"
				+ "			<th>number of seats</th>\r\n"
				+ "			<th>number of courses</th>\r\n"
				+ "		</thead>");
		response.getWriter().println("  <tr>\r\n"
				+ "                    <td>"+institute.getInst_id()+"</td>\r\n"
				+ "									<td>"+institute.getInstitute_name()+"</td>\r\n"
				+ "								<td>"+institute.getAffiliation_Date()+"</td>\r\n"
				+ "								<td>"+institute.getAddress()+"</td>\r\n"
				+ "								<td>"+institute.getNumber_of_seats()+"</td>\r\n"
				+ "								<td>"+institute.getNumber_of_course()+"</td>\r\n"
				+ "\r\n"
				+ "                </tr>");
		response.getWriter().println("</table>");

	}
}


