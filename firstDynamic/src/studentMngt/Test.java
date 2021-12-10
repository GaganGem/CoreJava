package studentMngt;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) throws Exception {
		ArrayList<StudentBean> list = StudentModel.search();
		for (StudentBean sl : list) {
			System.out.println(sl.getRollNo()+" "+sl.getfName()+" "+sl.getlName());
		}
		

	}
}
