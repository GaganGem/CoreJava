package trycatch;

public class ExceptionalHandling {
public static void main(String[] args) {
	
	int k= 0;int i= 20;
	try {
		double d = i/k;
		System.out.println("div is"+d);
		}
	
 catch (ArithmeticException e) {
	 System.out.println("dividend by zero");
			
			
		}
		
	}
}

