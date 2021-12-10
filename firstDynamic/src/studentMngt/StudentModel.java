package studentMngt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import connection.JdbcConnection;

public class StudentModel {

	public static int add(StudentBean bean) throws Exception {
		int r = 0;
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		PreparedStatement ps = conn
				.prepareStatement("INSERT INTO MARKSHEET (ID,ROLLNO,FNAME,LNAME,SESSION) VALUES(?,?,?,?,?)");
		ps.setInt(1, nextPk());
		ps.setString(2, bean.getRollNo());
		ps.setString(3, bean.getfName());
		ps.setString(4, bean.getlName());
		ps.setString(5, bean.getSession());
		r = ps.executeUpdate();

		JdbcConnection.closeConn(conn, ps);

		return r;
	}

	public static int update(StudentBean bean) throws Exception {
		int r = 0;
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		PreparedStatement ps = conn
				.prepareStatement("UPDATE MARKSHEET SET ROLLNO = ?, FNAME = ?,LNAME = ?,SESSION=? WHERE ID = ?");
		ps.setString(2, bean.getfName());
		ps.setString(3, bean.getlName());
		ps.setString(1, bean.getRollNo());
		ps.setString(4, bean.getSession());
		ps.setInt(5, bean.getId());
		r = ps.executeUpdate();

		JdbcConnection.closeConn(conn, ps);

		return r;
	}

	public static int delete(int id) throws Exception {

		int r = 0;

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		PreparedStatement ps = conn.prepareStatement("DELETE FROM MARKSHEET WHERE ID = ?");
		ps.setInt(1, id);
		r = ps.executeUpdate();

		JdbcConnection.closeConn(conn, ps);

		return r;
	}

	public static int get(StudentBean bean) throws Exception {
		int r = 0;
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		PreparedStatement ps = conn.prepareStatement("SELECT ROLLNO, FNAME,LNAME,SESSION FROM MARKSHEET WHERE ID = ?");

		ps.setInt(1, bean.getId());

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			bean.setRollNo(rs.getString(1));
			bean.setfName(rs.getString(2));
			bean.setlName(rs.getString(3));
			bean.setSession(rs.getString(4));
		}
		
		r=1;
		JdbcConnection.closeConn(conn, ps, rs);
		return r;
	}

	public static ArrayList<StudentBean> search() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		PreparedStatement ps = conn.prepareStatement("SELECT ID, ROLLNO,FNAME,LNAME,SESSION FROM MARKSHEET");
		ArrayList<StudentBean> l = new ArrayList<StudentBean>();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			StudentBean bean = new StudentBean();
			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getString(2));
			bean.setfName(rs.getString(3));
			bean.setlName(rs.getString(4));
			bean.setSession(rs.getString(5));
			l.add(bean);
		}
		JdbcConnection.closeConn(conn, ps, rs);
		return l;

	}

	private static int nextPk() throws Exception {
		int id = 0;

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		Statement s = conn.createStatement();
		ResultSet r = s.executeQuery("SELECT MAX(ID) FROM marksheet");
		while (r.next()) {
			id = r.getInt(1);
		}
		r.close();
		s.close();
		conn.close();

		return id + 1;
	}

}
