package registration;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegModel {

	public static String add(RegBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		String result = null;

		conn.setAutoCommit(false);

		PreparedStatement ps = conn
				.prepareStatement("INSERT INTO RECORD (ID,FNAME,LNAME,EMAIL,PASS,GENDER,DOB) VALUES(?,?,?,?,?,?,?)");
		ps.setInt(1, nextPk());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getEmail());
		ps.setString(5, bean.getPass());
		ps.setString(6, bean.getGender());
		ps.setDate(7, new Date(bean.getDob().getTime()));
		ps.executeUpdate();
		ps.close();

		result = "inserted";

		conn.commit();
		conn.close();

		return result;
	}

	private static int nextPk() throws Exception {
		int id = 0;

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		Statement s = conn.createStatement();

		ResultSet r = s.executeQuery("SELECT MAX(ID) FROM RECORD");

		while (r.next()) {
			id = r.getInt(1);
		}
		r.close();
		s.close();
		conn.close();

		return id+1;
	}
}
