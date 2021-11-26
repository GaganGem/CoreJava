package exercise7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckEndDate {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = sim.parse(s);
		String e = sc.nextLine();
		SimpleDateFormat sim2 = new SimpleDateFormat("yyyy-MM-dd");
		Date endDate = sim2.parse(e);
		if (startDate.before(endDate)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		sc.close();
	}

}
