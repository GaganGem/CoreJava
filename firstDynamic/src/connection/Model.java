package connection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Model {
	
	public static String auth(Bean bean) throws Exception {

		String result = null;
		String pass = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement ps = con.prepareStatement("SELECT FNAME, PASS FROM RECORD WHERE EMAIL= ?");
		ps.setString(1, bean.getEmail());
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			bean.setFname(rs.getString(1));
			pass = rs.getString(2);
		}

		if (bean.getPass().equals(pass)) {
			result = bean.getFname();
		}
		JdbcConnection.closeConn(con, ps, rs);

		return result;
	}

	public static void reset(Bean bean) throws Exception {
		String pass = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				PreparedStatement ps = con.prepareStatement("SELECT PASS FROM RECORD WHERE EMAIL= ?");
		ps.setString(1, bean.getEmail());
		ResultSet rs = ps.executeQuery();
		bean.setPass(pass);
		while (rs.next()) {
			bean.setPass(rs.getString(1));
		}
		JdbcConnection.closeConn(con, ps, rs);
	}

	public static String add(Bean bean) throws Exception {
		String result = null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				PreparedStatement ps = con
				.prepareStatement("INSERT INTO RECORD (ID,FNAME,LNAME,EMAIL,PASS,GENDER,DOB) VALUES(?,?,?,?,?,?,?)");
		ps.setInt(1, nextPk());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getEmail());
		ps.setString(5, bean.getPass());
		ps.setString(6, bean.getGender());
		ps.setDate(7, new Date(bean.getDob().getTime()));
		ps.executeUpdate();
		JdbcConnection.closeConn(con, ps);

		result = "inserted";

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
