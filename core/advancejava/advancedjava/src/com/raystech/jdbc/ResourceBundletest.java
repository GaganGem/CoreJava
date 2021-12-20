package com.raystech.jdbc;

import java.sql.DriverManager;
import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundletest {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.raystech.jdbc.appp", new Locale("hi"));
		String url = rb.getString("url");
		String driver = rb.getString("driver");
		String username = rb.getString("username");
		String password = rb.getString("password");
		System.out.println(url);
		System.out.println(driver);
		System.out.println(username);
		System.out.println(password);
		System.out.println(rb.getString("greetings"));
		
	}

}
