package connection;

import java.util.ArrayList;

public class TestMarksheetModel {
	
	static MarksheetModel stud = new MarksheetModel();
	static MarksheetBean b = new MarksheetBean();
	
	public static void main(String[] args) throws Exception {
		
		b.setRollNo("109");
		b.setfName("RAMESH");
		b.setlName("HEN");
		b.setPhy(45);
		b.setChe(55);
		b.setMat(65);
		
		testAdd();
//		testUpdate();
//		testDelete();
//		testGet();
//		testGetMeritList();

	}
	

	private static void testGetMeritList() throws Exception {
		ArrayList<String> merit = stud.getMeritList();
		stud.getMeritList();
		
		for (String string : merit) {
			System.out.println(string);
		}
	}

	private static void testGet() throws Exception {
		stud.get(b.getRollNo());
	}

	private static void testDelete() throws Exception {
		stud.delete(b.getRollNo());
	}

	private static void testUpdate() throws Exception {
		stud.update(b);
		
	}

	private static void testAdd() throws Exception {
		
		stud.add(b);
	}
}
