package exercise4;

public class ArmstrongNo {
	public static void main(String[] args) {
		int num=153,a= 0,res=0,b,c;
		b=num;
		c=num;
		int digits=0;
		while (c!=0) {
			c/=10;
			digits++;
		}
		
		while (num!=0) {
			a = num%10;
			res = (int) (res+(Math.pow(a, digits)));
			num/=10;
		}
		if (res==b) {
			System.out.println("an Arm no");
		} else {
			System.out.println("Not an Arm no");
		}
		
		
	}
}
