package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MarksheetModel {
	public void add(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		conn.setAutoCommit(false);
		try {

			PreparedStatement ps = conn
					.prepareStatement("INSERT INTO MARKSHEET (ROLLNO,FNAME,LNAME,PHY,CHEM,MATH) VALUES(?,?,?,?,?,?)");

			// ps.setInt(1, bean.getId());
			ps.setString(1, bean.getRollNo());
			ps.setString(2, bean.getfName());
			ps.setString(3, bean.getlName());
			ps.setInt(4, bean.getPhy());
			ps.setInt(5, bean.getChe());
			ps.setInt(6, bean.getMat());

			ps.executeUpdate();
			ps.close();
			System.out.println("inserted");

		} catch (Exception e) {
			conn.rollback();
			System.out.println(e.getMessage());

		}

		conn.commit();
		conn.close();

	}

	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		conn.setAutoCommit(false);
		try {

			PreparedStatement ps = conn.prepareStatement(
					"UPDATE MARKSHEET SET FNAME = ?,LNAME = ?,PHY = ?,CHEM = ?,MATH = ? WHERE ROLLNO = ?");

			ps.setString(6, bean.getRollNo());
			ps.setString(1, bean.getfName());
			ps.setString(2, bean.getlName());
			ps.setInt(3, bean.getPhy());
			ps.setInt(4, bean.getChe());
			ps.setInt(5, bean.getMat());

			ps.executeUpdate();
			ps.close();
			System.out.println("updated");

		} catch (Exception e) {
			conn.rollback();
			System.out.println(e.getMessage());

		}

		conn.commit();
		conn.close();

	}

	public void delete(String rollNo) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		conn.setAutoCommit(false);
		try {

			PreparedStatement ps = conn.prepareStatement("DELETE FROM MARKSHEET WHERE ROLLNO = ?");

			ps.setString(1, rollNo);

			ps.executeUpdate();

			ps.close();
			System.out.println("Record of " + rollNo + " has been Deleted");

		} catch (Exception e) {
			conn.rollback();
			System.out.println(e.getMessage());

		}

		conn.commit();
		conn.close();
	}

	public void get(String rollNo) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		conn.setAutoCommit(false);
		try {

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM MARKSHEET WHERE ROLLNO = ?");

			ps.setString(1, rollNo);

			ResultSet rs = ps.executeQuery();

			rs.next();
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4)
					+ " " + rs.getInt(5) + " " + rs.getInt(6) + " " + rs.getInt(7));

			rs.close();
			ps.close();

		} catch (Exception e) {
			conn.rollback();
			System.out.println(e.getMessage());

		}

		conn.commit();
		conn.close();
	}

	public ArrayList<String> getMeritList() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

		conn.setAutoCommit(false);
		ArrayList<String> merit = new ArrayList<String>();

		try {

			PreparedStatement ps = conn
					.prepareStatement("SELECT ROLLNO, PHY+CHEM+MATH AS TOTAL FROM MARKSHEET ORDER BY TOTAL DESC");

			ResultSet rs = ps.executeQuery();

			for (int i = 1; i <= 5; i++) {
				rs.next();
				merit.add(rs.getString(1));
//				System.out.println("RANK = " + i + ", " 
//				+ "Roll No " + rs.getString(1) + ", " + " Total Marks " + rs.getInt(2));
			}

			rs.close();
			ps.close();

		} catch (Exception e) {
			conn.rollback();
			System.out.println(e.getMessage());

		}

		conn.commit();
		conn.close();
		return merit;
	}

}
