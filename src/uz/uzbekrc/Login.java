package uz.uzbekrc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		if(username.equals("murod9393") && password.equals("narxoz11")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("Welcome.jsp");
			
		}else {
			response.sendRedirect("login.jsp");
		}
		
	}


}
