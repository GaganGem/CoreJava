package com.raystech.jdbc;

public class Marksheetbean {
	private int Rollno;
	private String fname;
	private int Chemistry;
	private int Physics;
	private int Maths;

	public Marksheetbean() {
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getChemistry() {
		return Chemistry;
	}

	public void setChemistry(int chemistry) {
		Chemistry = chemistry;
	}

	public int getPhysics() {
		return Physics;
	}

	public void setPhysics(int physics) {
		Physics = physics;
	}

	public int getMaths() {
		return Maths;
	}

	public void setMaths(int maths) {
		Maths = maths;
	}

}
