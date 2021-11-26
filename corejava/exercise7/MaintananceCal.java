package exercise7;

import java.time.LocalDate;

public class MaintananceCal {
	public static void main(String[] args) {
	
		LocalDate ins = LocalDate.now();
		
		LocalDate mntn = ins.plusDays(30);
		
		System.out.println("your next maintanance date is " + mntn);
		
		LocalDate cal = mntn;
		for (int i = 1; i < 12; i++) {
			cal = cal.plusDays(30);
			System.out.println(cal);
			
		}
		
		
		
		
	}
}
