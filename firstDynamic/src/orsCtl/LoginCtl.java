package orsCtl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import connection.Bean;
import connection.DataValidator;
import connection.Model;

@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Bean bean = new Bean();
		RequestDispatcher rd = null;
		String login = request.getParameter("login");
		String pwd = request.getParameter("password");
		if(!DataValidator.isEmail(login)){
			request.setAttribute("emailError", "Invalid Email Id!");
			rd = request.getRequestDispatcher("LoginView.jsp");
			rd.forward(request, response);
		}
		if(DataValidator.isNull(pwd)){
			request.setAttribute("passError", "Invalid Password!");
			rd = request.getRequestDispatcher("LoginView.jsp");
			rd.forward(request, response);
		}
		
		bean.setEmail(login);
		bean.setPass(pwd);

		PrintWriter pw = response.getWriter();
		String result = null;
		try {
			result = Model.auth(bean);

			if (result != null) {
				HttpSession session = request.getSession();
				session.setAttribute("name", result);
				session.setAttribute("login", login);
				session.setAttribute("pass", pwd);
				rd = request.getRequestDispatcher("WelcomeCtl");
				rd.forward(request, response);

			} else {
				rd = request.getRequestDispatcher("LoginView.jsp");
				request.setAttribute("error", "Invalid Id & Password!");
				rd.forward(request, response);	
			}

		} catch (Exception e) {
			pw.println(e.getMessage());
		}

	}

}
