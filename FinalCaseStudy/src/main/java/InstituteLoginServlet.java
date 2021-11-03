import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.traininginstitute.entities.Institute;

public class InstituteLoginServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//		int instId = 0;
		//		String pass = null;
		int instId = 0;
		String pass = null;
		RequestDispatcher rd=null;
		String id=	request.getParameter("instid");
		instId = Integer.parseInt(id);
		pass = request.getParameter("pass");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f = cfg.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Institute institute = null;
		institute = (Institute) s.load(Institute.class, new Integer(instId));
		boolean result = (institute.getPassword().equals(pass));

		if(result) {
			HttpSession hs=	request.getSession();
			hs.setAttribute("INST_ID", id);
			hs.setAttribute("INST_USER", institute.getInstitute_name());
			rd=request.getRequestDispatcher("institutehome.html");
			rd.include(request, response);
		}
		else {
			response.getWriter().println("<script>alert('Login failed Please Check Your UserID or Password')</script>");
			RequestDispatcher r = request.getRequestDispatcher("InstituteLogin.html");
			r.include(request, response);
		}

	}


}
