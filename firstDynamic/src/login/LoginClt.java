package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginClt")
public class LoginClt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		LoginBean bean = new LoginBean();
		
		bean.setUser(request.getParameter("login"));
		bean.setPwd(request.getParameter("password"));
		
		PrintWriter pw = response.getWriter();
		
		String result = null;
		try {
			result = LoginModel.auth(bean);
			
			switch (result) {
			case "success":
				pw.println("Hi, "+bean.getUser());
				break;
			default:
				pw.println("Invalid User Id & Password");
				break;
			}
		
		} catch (Exception e) {
			pw.println(e.getMessage());
		}
	
	}

}
