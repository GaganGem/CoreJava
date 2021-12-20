package com.raystech.jdbc;

public class Testmaksheet {
	public static void main(String[] args) throws Exception {
		//delete();
	//add();
	update();
	//	get();
		
	}
	

	private static void update() {
		// TODO Auto-generated method stub
		Marksheetbean m = new Marksheetbean();
		m.setFname("deepak");
		m.setPhysics(89);
		m.setMaths(60);
		m.setRollno(4);
		m.setChemistry(90);

		Marksheetmodel y = new Marksheetmodel();
	y.update(m);
	
	}
}


	/*public static void add() throws Exception {

		Marksheetbean m = new Marksheetbean();
		m.setFname("deepak");
		m.setPhysics(55);
		m.setMaths(60);
		m.setRollno(9);
		m.setChemistry(90);

		Marksheetmodel y = new Marksheetmodel();
		y.add(m);
	/*	 y.update(m);
	
		

	}}

/*	public static void update() throws Exception {

		
		
	

	}/*

	/*public static void delete() throws Exception {
		Marksheetbean marksheetbean = new Marksheetbean();
		Marksheetmodel marksheetmodel = new Marksheetmodel();
		marksheetbean.setRollno(4);
		marksheetmodel.delete(marksheetbean);
	

	}
	public static void get() throws Exception {
		Marksheetbean marksheetbean = new Marksheetbean();
		Marksheetmodel marksheetmodel = new Marksheetmodel();
		marksheetbean.setRollno(5);
		marksheetmodel.getrollno(marksheetbean);
	
}}*/
