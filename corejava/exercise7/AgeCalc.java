package exercise7;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(1999, 06, 14);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(dob, today);
		System.out.println(""+p.getYears()+" "+p.getMonths()+" "+p.getDays());
	
	
	}
}
