package exercise4;

public class CheckPrime {
	public static void main(String[] args) {
		int a = 111;

		for (int i = 2; i < a/2; i++) {
			if (a % i == 0) {
				System.out.println("Devide by "+i+" Not a Prime No.");
				System.exit(0);
			} 
		}
		System.out.println("A Prime No");
	}

}
