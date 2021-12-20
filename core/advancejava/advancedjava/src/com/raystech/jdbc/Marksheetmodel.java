
package com.raystech.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

public class Marksheetmodel {

	public void add(Marksheetbean bean) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root",
				"root");
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("INSERT INTO tablename2 VALUES(?,?,?,?,?)");
		ps.setString(5, bean.getFname());
		ps.setInt(3, bean.getChemistry());
		ps.setInt(4, bean.getMaths());
		ps.setInt(2, bean.getPhysics());
		ps.setInt(1, bean.getRollno());

		ps.execute();
		con.commit();
		ps.close();
		con.close();
		System.out.println("inserted");
	}

	public void update(Marksheetbean bean) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root",
					"root");
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(
					"UPDATE TABLENAME2 SET FNAME=?,CHEMISTRY =?,PHYSICS =?,MATHS = ? WHERE ROLLNO = ?");
			ps.setString(1, bean.getFname());
			ps.setInt(2,bean.getChemistry());
			ps.setInt(4, bean.getMaths());
			ps.setInt(3, bean.getPhysics());
			ps.setInt(5, bean.getRollno());
			
			ps.execute();
			System.out.println(ps.toString());
			con.commit();
			ps.close();
			con.close();
			System.out.println("updated");
		} catch (Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

	public void delete(Marksheetbean bean) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root",
				"root");
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("DELETE FROM TABLENAME2 WHERE ROLLNO = ?");

		ps.setInt(1, bean.getRollno());
		ps.execute();
		con.commit();
		ps.close();
		con.close();
		System.out.println("deleted!!");
	
	}
public void getrollno(Marksheetbean  bean) throws Exception {

	Class.forName("com.mysql.jdbc.Driver");
	Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root",
			"root");
	con.setAutoCommit(false);
	PreparedStatement ps = con.prepareStatement("SELECT * FROM TABLENAME2 WHERE ROLLNO = ?");
	ps.setInt(1, bean.getRollno());
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getString(3));
	System.out.println(rs.getString(4));
	System.out.println(rs.getString(5));
	}
	con.commit();
	ps.close();
	con.close();
	System.out.println("get!!");
	}


public ArrayList<String> getMeritList() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

	Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root", "root");

	conn.setAutoCommit(false);
	ArrayList<String> merit = new ArrayList<String>();

	try {

		PreparedStatement ps = conn
				.prepareStatement("SELECT ROLLNO, PHY+CHEM+MATH AS TOTAL FROM tablename2 ORDER BY TOTAL DESC");

		ResultSet rs = ps.executeQuery();

		for (int i = 1; i <= 5; i++) {
			rs.next();
			merit.add(rs.getString(1));
//			System.out.println("RANK = " + i + ", " 
//			+ "Roll No " + rs.getString(1) + ", " + " Total Marks " + rs.getInt(2));
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