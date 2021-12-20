package basicjava;
import java.util.Scanner;

public class Javaswitch1 {

	public static void main(String[] args) {
			byte m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks in Physics");
		m1 =sc.nextByte();
		System.out.println("Enter your marks in Chemistry");
		m2=sc.nextByte();
		System.out.println("Enter your marks in Mathematics");
		m3 = sc.nextByte();
		float avg =(m1+m2+m2)/3.0f;
		 if (avg>=4 && m1>=33 && m2>=33 && m3>= 33 ) {
			 System.out.println("Congratulatio,you have beeen promoted");
		 }
		 else {
			 System.out.println("Sorry, you have not been promoted");
		 }
				
		

	}

}
