package orsCtl;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import connection.Bean;
import connection.DataValidator;
import connection.Model;

@WebServlet("/ForgotPassCtl")
public class ForgotPassCtl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bean bean = new Bean();
		RequestDispatcher rd = request.getRequestDispatcher("forgotPassView.jsp");
		String login = request.getParameter("login");
		if(!DataValidator.isEmail(login)){
			request.setAttribute("emailError", "Invalid Email Id!");
			rd.forward(request, response);
		}
		bean.setEmail(login);
		try {
			Model.reset(bean);
		} catch (Exception e) {}
		if (bean.getPass()!=null){ 
			request.setAttribute("pass", bean.getPass());	
			rd.forward(request, response);
		} 		
	}

}
