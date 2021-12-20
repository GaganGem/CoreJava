package basicjava;

import java.util.Scanner;

public class HarmonicS {
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the valueof n");
		int n = Sc.nextInt();
		float sum =0.0f;
		for(int i=1;i<=n;i++)
		{
			sum =sum+ (float) 1/i;
			System.out.println("sum"+sum);
		}
		
		
		
		
				
	}

}
