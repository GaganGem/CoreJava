package studentMngt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/StudentProfileCtl")
public class StudentProfileCtl extends HttpServlet {

	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean bean = new StudentBean();
		bean.setId(Integer.parseInt(request.getParameter("id")));
		int res=0;
		try {
			res = StudentModel.get(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (res==1) {
			request.setAttribute("rollNo", bean.getRollNo());
			request.setAttribute("fName", bean.getfName());
			request.setAttribute("lName", bean.getlName());
			request.setAttribute("session", bean.getSession());
			RequestDispatcher rd = request.getRequestDispatcher("StudentProfileView.jsp");
			rd.forward(request, response);
			
		}
	
	}

}
