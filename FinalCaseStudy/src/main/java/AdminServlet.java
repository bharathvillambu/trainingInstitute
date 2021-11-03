import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usr = request.getParameter("user");
		String pass = request.getParameter("password");
		RequestDispatcher rd = null;
		char[]arr = usr.toCharArray();
		if(pass.equals(null)){
		for(char ch : arr) {
			if(Character.isDigit(ch)) {
				response.getWriter().println("<script>alert('Username Can't Be A Number')</script>");
			}
		}
		}
		else if(usr.equals(null) && pass.equals(null)) {
			response.getWriter().println("Value Can't Be Null");
			rd = request.getRequestDispatcher("Admin.html");
		}
		else if (usr.equalsIgnoreCase(pass)) {
			HttpSession hs = request.getSession();
			hs.setAttribute("USER", usr);
			rd = request.getRequestDispatcher("adminmenu.html");
			rd.forward(request, response);
		}
		else {
			response.getWriter().println("<script>alert('Invalid Credentials')</script>");
			rd = request.getRequestDispatcher("Admin.html");
			rd.include(request, response);
		}
	}


}
