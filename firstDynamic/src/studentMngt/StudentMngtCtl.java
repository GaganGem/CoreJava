package studentMngt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentMngtCtl")
public class StudentMngtCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentBean bean = new StudentBean();
		bean.setId(Integer.parseInt(request.getParameter("id")));
		bean.setRollNo(request.getParameter("rollNo"));
		bean.setfName(request.getParameter("fName"));
		bean.setlName(request.getParameter("lName"));
		bean.setSession(request.getParameter("session"));	
		String op = request.getParameter("operation");
		int res = 0;
		if (op.equals("Add")) {
			try {
				res = StudentModel.add(bean);
				if (res == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("StudentMngtView.jsp");
					request.setAttribute("msg", "You Have Successfully Registerd");
					rd.forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (op.equals("Delete")) {
			try {
				res = StudentModel.delete(bean.getId());
					if (res == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("StudentMngtView.jsp");
					request.setAttribute("msg", "You Have Deleted Record");
					rd.forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (op.equals("Modify")) {
			try {
				res = StudentModel.update(bean);
				if (res == 1) {
					RequestDispatcher rd = request.getRequestDispatcher("StudentMngtView.jsp");
					request.setAttribute("msg", "You Have Successfully Updated Record");
					rd.forward(request, response);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
