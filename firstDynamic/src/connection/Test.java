package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import studentMngt.StudentBean;

public class Test {
	public static void main(String[] args) throws Exception {
		StudentBean b = new StudentBean();
		b.setRollNo("101");
		reset(b);
		System.out.println(b.getfName());
	}

	public static void reset(StudentBean bean) throws Exception {
		String pass = null;

		Connection con = JdbcConnection.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT fname from Marksheet WHERE rollno = ?");
		ps.setString(1, bean.getRollNo());
		ResultSet rs = ps.executeQuery();
		bean.setfName(pass);
		while (rs.next()) {
			bean.setfName(rs.getString(1));
		}
		JdbcConnection.closeConn(con, ps, rs);
	}

}
