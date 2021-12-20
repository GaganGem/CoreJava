package com.raystech.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Metadata1 {
	public static void main(String[] args) throws Exception  {

		Class.forName("com.mysql.jdbc.Driver");
	Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	Statement stmt = con.createStatement();
	ResultSet rs = stmt
			.executeQuery("SELECT fname,lname from studentdata");

	ResultSetMetaData rsmt = rs.getMetaData();
	System.out.println( rsmt.getCatalogName(1));
	System.out.println(rsmt.getTableName(1));
	int columnCount = rsmt.getColumnCount();
	System.out.println("Total Columns :" + columnCount);
	System.out.println();

	while(rs.next()) {
		System.out.println("Name : " + rsmt.getColumnName(2));
		System.out.println("Precision : " + rsmt.getPrecision(1));
		System.out.println("Type : " + rsmt.getColumnTypeName(2));
		
	}
	
	


	stmt.close();
	con.close();
	
}}

