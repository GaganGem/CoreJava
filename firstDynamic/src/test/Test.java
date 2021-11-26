package test;

import java.util.Date;


public class Test {
	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d.getTime());
		
		java.sql.Date v = new java.sql.Date(d.getTime());
		System.out.println(v);
		
	}

}
