package com.raystech.jdbc;

import java.util.Locale;
import java.util.ResourceBundle;

public class Testlocale1 {
	public static void main(String[] args) {
//		ResourceBundle rb = ResourceBundle.getBundle("com.raystec.jdbc.nam");
//		System.out.println(rb.getString("greeting"));
		
		ResourceBundle rb = ResourceBundle.getBundle("com.raystech.jdbc.appp",new Locale("hi"));
		System.out.println(rb.getString("greeting"));
		
	}
}
