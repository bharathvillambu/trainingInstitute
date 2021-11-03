
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminDeleteInstituteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String s=request.getParameter("sid");
	     String inst_name=null;
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
	
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/fcs","root","welcome");
		  PreparedStatement p1 = c.prepareStatement("select inst_name from institutes where inst_id =" +s);
	      ResultSet resulSet = p1.executeQuery();
	      if (resulSet.next()) {
	        inst_name = resulSet.getString(1);
	      }
		PreparedStatement p=c.prepareStatement("delete from institutes where inst_id="+s);
		p.executeUpdate();
//		PreparedStatement pt=c.prepareStatement("update students set inst_name=NULL where inst_name='"+inst_name+"'");
//		pt.executeUpdate();
		response.getWriter().println("<script>alert('Institute Deleted Successfully')</script>");
		RequestDispatcher rd = request.getRequestDispatcher("adminmenu.html");
		rd.include(request, response);
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