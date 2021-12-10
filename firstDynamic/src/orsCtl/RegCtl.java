package orsCtl;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import connection.Bean;
import connection.DataValidator;
import connection.Model;

@WebServlet("/RegCtl")
public class RegCtl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		try {
		Bean bean = new Bean();
		SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		RequestDispatcher rd = null;
		
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String login = request.getParameter("email");
		String pass = request.getParameter("pass");
		String gen = request.getParameter("gender");
		String date = request.getParameter("dob");
		
		if(!DataValidator.isName(fName)){
			request.setAttribute("fErr", "Invalid First Name!");
			rd = request.getRequestDispatcher("RegistrationView.jsp");	
			rd.forward(request, response);
		}if(!DataValidator.isName(lName)){
			request.setAttribute("lErr", "Invalid Last Name!");
			rd = request.getRequestDispatcher("RegistrationView.jsp");	
			rd.forward(request, response);
	
		}if(!DataValidator.isEmail(login)){
			request.setAttribute("eErr", "Invalid Email Id!");
			rd = request.getRequestDispatcher("RegistrationView.jsp");	
			rd.forward(request, response);
	
		}if(!DataValidator.isNotNull(pass)){
			request.setAttribute("pErr", "Invalid Password!");
			rd = request.getRequestDispatcher("RegistrationView.jsp");	
			rd.forward(request, response);
	
		}if(!DataValidator.isNotNull(gen)){
			request.setAttribute("gErr", "Invalid Gender!");
			rd = request.getRequestDispatcher("RegistrationView.jsp");	
			rd.forward(request, response);
	
		}if(!DataValidator.isNotNull(date)){
			request.setAttribute("dErr", "Invalid Dob!");
			rd = request.getRequestDispatcher("RegistrationView.jsp");	
			rd.forward(request, response);
		}		
		
		Date d = sim.parse(request.getParameter(date));
		bean.setFname(request.getParameter(fName));
		bean.setLname(request.getParameter(lName));
		bean.setEmail(request.getParameter(login));
		bean.setPass(request.getParameter(pass));
		bean.setGender(request.getParameter(gen));
		bean.setDob(d);

			String r = Model.add(bean);
			if (r.equals("inserted")) {
				rd = request.getRequestDispatcher("LoginView.jsp");
				request.setAttribute("msg", "You have successfully registered");
				rd.forward(request, response);
			} else {
				rd = request.getRequestDispatcher("RegistrationView.jsp");	
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
