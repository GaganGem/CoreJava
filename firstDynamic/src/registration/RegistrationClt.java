package registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationClt")
public class RegistrationClt extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		try {
		RegBean bean = new RegBean();
		SimpleDateFormat sim = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sim.parse(request.getParameter("dob"));
		bean.setFname(request.getParameter("fname"));
		bean.setLname(request.getParameter("lname"));
		bean.setEmail(request.getParameter("email"));
		bean.setPass(request.getParameter("pass"));
		bean.setGender(request.getParameter("gender"));
		bean.setDob(d);

		PrintWriter out = response.getWriter();
		
		
			String r = RegModel.add(bean);
			if (r=="inserted") {
				out.println("You Have Successfully Registered" );
						
			} else {
				out.println("You Registration has been failed" );
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
