package basicjava;

import java.util.Scanner;

public class Moreswitch {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your Age");
		Scanner sc =new Scanner(System.in);
		age =sc.nextInt();
		
		if (age>56) {
			System.out.println("you are experienced");
		}
		else if (age>25) {
			System.out.println("you are semi experienced");
		}
		else if (age>21) {
			System.out.println("you are fresher");
	}
	else {
	System.out.println("you are not eligible to work");
		
	
			
		}
		
	}

}

