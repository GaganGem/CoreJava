package com.opps;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Testperson {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Persons g = new Persons();
		g= new Persons();
		g.setName("palak");
		g.setDob(sdf.parse("25/06/1996"));
		g.setAddress("madhumilan");
		System.out.println(g.getName());
		System.out.println(g.getDob());
		System.out.println(g.getAddress());
		
		
		
		
		
	}

}
