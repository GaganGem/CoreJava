package com.raystech.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.mysql.jdbc.Connection;

public class Preparestatement1 {
	public static void main(String[] args) throws Exception {
		add(10);
	}
		
		private static void add(int a) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
	Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
int id = a;
 PreparedStatement ps = con.prepareStatement("select * from STUDENTDATA WHERE ID = ?");
ps.setInt(1,id);

ResultSet rs = ps.executeQuery();
while(rs.next()) {
System.out.println(rs.getInt(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));




}		
}

}
