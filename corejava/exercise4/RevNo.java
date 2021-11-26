package exercise4;

public class RevNo {
	public static void main(String[] args) {
		int a=54321,res=0,rev=0;
	
		while (a!=0) {
			res = a%10;
			rev = rev*10 + res;
			a = a/10;
		}
		System.out.println(rev);
		
		
	}
}
