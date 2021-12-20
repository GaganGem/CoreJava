package basicjava;

import java.util.Scanner;

public class Switchcas {
	public static void main(String[] args) {
		
//		if(year%4==0 && year%100!=0 || year%400==0)
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        if (year%4==0 && (year%100!=0 || year%400==0)) {
            System.out.println("Given year is a leap year");
        }else {
            System.out.println("Given year is not leap year");
        }
        
	}

}
