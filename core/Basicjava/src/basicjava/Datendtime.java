package basicjava;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Datendtime {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		Date today =new Date();
		SimpleDateFormat p =new SimpleDateFormat("dd/MM/yy");
	    String strDATE = p.format(today);
	    System.out.println(strDATE);
	    
	    SimpleDateFormat p1 = new SimpleDateFormat("MMM,dd,yyyy");
	    strDATE = p1.format(today);
	    System.out.println(strDATE);
		
		Date PDate= p.parse("15/08/1947");
		
		System.out.println(PDate);
		
		
	}

}
